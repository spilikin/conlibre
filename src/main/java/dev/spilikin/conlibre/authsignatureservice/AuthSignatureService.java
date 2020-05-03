package dev.spilikin.conlibre.authsignatureservice;

import de.gematik.ws.conn.authsignatureservice.wsdl.v7_4.AuthSignatureServicePortType;
import de.gematik.ws.conn.authsignatureservice.wsdl.v7_4.FaultMessage;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import de.gematik.ws.conn.signatureservice.v7.ExternalAuthenticate;
import de.gematik.ws.conn.signatureservice.v7.ExternalAuthenticateResponse;
import de.gematik.ws.conn.signatureservice.v7.ObjectFactory;
import dev.spilikin.conlibre.ErrorMessage;
import dev.spilikin.conlibre.KonnektorError;
import dev.spilikin.conlibre.Version;
import dev.spilikin.conlibre.softcard.CryproUtil;
import dev.spilikin.conlibre.softcard.PrivateKeyObject;
import dev.spilikin.conlibre.softcard.Softcard;
import oasis.names.tc.dss._1_0.core.schema.Base64Signature;
import oasis.names.tc.dss._1_0.core.schema.SignatureObject;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.Base64;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Version("7.4.0")
@WebService(
        targetNamespace = "http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4",
        name = "AuthSignatureService"
)
public class AuthSignatureService implements AuthSignatureServicePortType {
    @Resource
    private Map<String, Softcard> cards;

    private Set<String> pinVerifiedCardHandles = new HashSet<>();

    @Override
    public ExternalAuthenticateResponse externalAuthenticate(ExternalAuthenticate externalAuthenticate) throws FaultMessage {

        byte[] base64bytes = externalAuthenticate.getBinaryString().getBase64Data().getValue();
        byte[] bytesToSign = Base64.getDecoder().decode(base64bytes);

        if (externalAuthenticate.getOptionalInputs() == null || !SignatureType.PKCS1.getIdentifier().equals(externalAuthenticate.getOptionalInputs().getSignatureType())) {
            throw createTelematikError(KonnektorError.E4000, "Need to specify correct SignatureType");
        }

        Softcard card = cards.get(externalAuthenticate.getCardHandle());

        if (card == null) {
            throw createTelematikError(KonnektorError.E4000, String.format("Unknown card handle '%s'", externalAuthenticate.getCardHandle()));
        }

        //Nötige PIN ist nicht verifiziert, Fehlercode 4085
        if (!this.pinVerifiedCardHandles.contains(card.getName())) {
            throw createTelematikError(KonnektorError.E4085, String.format("Card '%s' has no verified PIN", card.getName()));
        }

        byte[] signedBytes;

        if (SignatureScheme.RSASSA_PKCS1_v1_5.getIdentifier().equals(externalAuthenticate.getOptionalInputs().getSignatureSchemes())) {
            CryproUtil.DigestAlgorithm digestAlgorithm;
            if (bytesToSign.length == 32) {
                digestAlgorithm = CryproUtil.DigestAlgorithm.SHA256;
            } else if (bytesToSign.length == 48) {
                digestAlgorithm = CryproUtil.DigestAlgorithm.SHA384;
            } else if (bytesToSign.length == 64) {
                digestAlgorithm = CryproUtil.DigestAlgorithm.SHA512;
            } else {
                throw createTelematikError(KonnektorError.E4000, String.format("Invalid sign data length: %d", bytesToSign.length));
            }
            try {
                byte[] digestInfo = CryproUtil.prepareHash(digestAlgorithm, bytesToSign);
                signedBytes = card.signPKCS1_V1_5(card.root().cd("DF.ESIGN").get(PrivateKeyObject.class, "PrK.HCI.AUT.R2048"), digestInfo);
            } catch (Exception e) {
                throw createTelematikError(KonnektorError.E4000, "Card error: " + e.toString());
            }
        } else {
            throw createTelematikError(KonnektorError.E4000, String.format("Unsupported signature scheme '%s'", externalAuthenticate.getOptionalInputs().getSignatureSchemes()));
        }

        ObjectFactory objectFactory = new ObjectFactory();
        ExternalAuthenticateResponse response = objectFactory.createExternalAuthenticateResponse();
        SignatureObject signatureObject = new SignatureObject();
        signatureObject.setBase64Signature(new Base64Signature());

        response.setStatus(new Status());
        response.getStatus().setResult("OK");

        signatureObject.getBase64Signature().setValue(Base64.getEncoder().encode(signedBytes));
        signatureObject.getBase64Signature().setType(SignatureType.PKCS1.getIdentifier());

        response.setSignatureObject(signatureObject);
        return response;
    }

    private FaultMessage createTelematikError(KonnektorError error, String message) {
        return new FaultMessage(message, new ErrorMessage(error));
    }

    public void addPinVerifiedCardHandle(String cardHandle) {
        this.pinVerifiedCardHandles.add(cardHandle);
    }
}
