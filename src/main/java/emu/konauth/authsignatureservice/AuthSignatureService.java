package emu.konauth.authsignatureservice;

import emu.konauth.Version;
import oasis.names.tc.dss._1_0.core.schema.Base64Signature;
import oasis.names.tc.dss._1_0.core.schema.SignatureObject;
import oasis.names.tc.dss._1_0.core.schema.Timestamp;
import telematik.ws.common.error.v2_0.Error;
import telematik.ws.conn.authsignatureservice.wsdl.v7_4.AuthSignatureServicePortType;
import telematik.ws.conn.authsignatureservice.wsdl.v7_4.FaultMessage;
import telematik.ws.conn.signatureservice.v7_4.ExternalAuthenticate;
import telematik.ws.conn.signatureservice.v7_4.ExternalAuthenticateResponse;
import telematik.ws.conn.signatureservice.v7_4.ObjectFactory;

import javax.jws.WebService;
import java.util.Base64;

@Version("7.4.0")
@WebService(
        targetNamespace = "http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4",
        name = "AuthSignatureService"
)
public class AuthSignatureService implements AuthSignatureServicePortType {
    @Override
    public ExternalAuthenticateResponse externalAuthenticate(ExternalAuthenticate externalAuthenticate) throws FaultMessage {

        try {
            byte[] base64bytes = externalAuthenticate.getBinaryString().getBase64Data().getValue();
            byte[] bytesToSign = Base64.getDecoder().decode(base64bytes);
            ObjectFactory objectFactory = new ObjectFactory();
            ExternalAuthenticateResponse response = objectFactory.createExternalAuthenticateResponse();
            SignatureObject signatureObject = new SignatureObject();
            signatureObject.setBase64Signature(new Base64Signature());
            signatureObject.setTimestamp(new Timestamp());

            byte[] signedBytes = new byte[bytesToSign.length];
            int pos = signedBytes.length-1;

            for (byte b : bytesToSign) {
                signedBytes[pos--] = b;
            }

            signatureObject.getBase64Signature().setValue(Base64.getEncoder().encode(signedBytes));
            response.setSignatureObject(signatureObject);
            return response;
        } catch (Exception e) {
            throw new FaultMessage("Bad parameter", new Error());
        }
    }
}
