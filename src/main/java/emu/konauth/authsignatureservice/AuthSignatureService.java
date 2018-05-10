package emu.konauth.authsignatureservice;

import emu.konauth.Version;
import emu.softcard.CryproUtil;
import emu.softcard.PrivateKeyObject;
import emu.softcard.Softcard;
import oasis.names.tc.dss._1_0.core.schema.Base64Signature;
import oasis.names.tc.dss._1_0.core.schema.SignatureObject;
import oasis.names.tc.dss._1_0.core.schema.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import telematik.ws.common.error.v2_0.Error;
import telematik.ws.conn.authsignatureservice.wsdl.v7_4.AuthSignatureServicePortType;
import telematik.ws.conn.authsignatureservice.wsdl.v7_4.FaultMessage;
import telematik.ws.conn.connectorcommon.v5_0.Status;
import telematik.ws.conn.signatureservice.v7_4.ExternalAuthenticate;
import telematik.ws.conn.signatureservice.v7_4.ExternalAuthenticateResponse;
import telematik.ws.conn.signatureservice.v7_4.ObjectFactory;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import java.util.*;

@Version("7.4.0")
@WebService(
        targetNamespace = "http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4",
        name = "AuthSignatureService"
)
public class AuthSignatureService implements AuthSignatureServicePortType {
    @Resource
    private Map<String, Softcard> cards;
    @Autowired
    private DatatypeFactory datatypeFactory;

    @Override
    public ExternalAuthenticateResponse externalAuthenticate(ExternalAuthenticate externalAuthenticate) throws FaultMessage {

        byte[] base64bytes = externalAuthenticate.getBinaryString().getBase64Data().getValue();
        byte[] bytesToSign = Base64.getDecoder().decode(base64bytes);

        if (externalAuthenticate.getOptionalInputs() == null || !SignatureType.PKCS1.getIdentifier().equals(externalAuthenticate.getOptionalInputs().getSignatureType())) {
            throw createTelematikError("4000", "Need to specify correct SignatureType");
        }

        Softcard card = cards.get(externalAuthenticate.getCardHandle());

        if (card == null) {
            throw createTelematikError("4000", String.format("Unknown card handle '%s'", externalAuthenticate.getCardHandle()));
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
                throw createTelematikError("4000", String.format("Invalid sign data length: %d", bytesToSign.length));
            }
            try {
                byte[] digestInfo = CryproUtil.prepareHash(digestAlgorithm, bytesToSign);
                signedBytes = card.signPKCS1_V1_5(card.root().cd("DF.ESIGN").get(PrivateKeyObject.class, "PrK.HCI.AUT.R2048"), digestInfo);
            } catch (Exception e) {
                throw createTelematikError("4058", "Card error: " + e.toString());
            }
        } else {
            throw createTelematikError("4000", String.format("Unsupported signature scheme '%s'", externalAuthenticate.getOptionalInputs().getSignatureSchemes()));
        }

        ObjectFactory objectFactory = new ObjectFactory();
        ExternalAuthenticateResponse response = objectFactory.createExternalAuthenticateResponse();
        SignatureObject signatureObject = new SignatureObject();
        signatureObject.setBase64Signature(new Base64Signature());
        signatureObject.setTimestamp(new Timestamp());

        response.setStatus(new Status());
        response.getStatus().setResult("OK");

        signatureObject.getBase64Signature().setValue(Base64.getEncoder().encode(signedBytes));
        response.setSignatureObject(signatureObject);
        return response;
    }

    private FaultMessage createTelematikError(String code, String message) {
        // TODO: create spec-conform errors
        Error telematikError = new Error();

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.setTimeZone(TimeZone.getDefault());

        telematikError.setMessageID(""); // According to gemSpec_OM "bzw. leer"
        telematikError.setTimestamp(this.datatypeFactory.newXMLGregorianCalendar(cal));

        return new FaultMessage(message, telematikError);
    }

}
