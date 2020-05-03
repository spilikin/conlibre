package de.gematik.ws.conn.authsignatureservice.wsdl.v7_4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-02T19:08:08.253+02:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4", name = "AuthSignatureServicePortType")
@XmlSeeAlso({de.gematik.ws.conn.certificateservicecommon.v2.ObjectFactory.class, org.w3._2001._04.xmlenc_.ObjectFactory.class, de.gematik.ws.conn.connectorcontext.v2.ObjectFactory.class, org.etsi.uri._01903.v1_3.ObjectFactory.class, de.gematik.ws.conn.signatureservice.v7.ObjectFactory.class, oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_.ObjectFactory.class, de.gematik.ws.conn.connectorcommon.v5.ObjectFactory.class, org.etsi.uri._02231.v2_.ObjectFactory.class, oasis.names.tc.dss._1_0.core.schema.ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class, de.gematik.ws.tel.error.v2.ObjectFactory.class, oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_.ObjectFactory.class, oasis.names.tc.saml._2_0.assertion.ObjectFactory.class, oasis.names.tc.saml._1_0.assertion.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AuthSignatureServicePortType {

    @WebMethod(operationName = "ExternalAuthenticate", action = "http://ws.gematik.de/conn/SignatureService/v7.4#ExternalAuthenticate")
    @WebResult(name = "ExternalAuthenticateResponse", targetNamespace = "http://ws.gematik.de/conn/SignatureService/v7.4", partName = "parameter")
    public de.gematik.ws.conn.signatureservice.v7.ExternalAuthenticateResponse externalAuthenticate(

        @WebParam(partName = "parameter", name = "ExternalAuthenticate", targetNamespace = "http://ws.gematik.de/conn/SignatureService/v7.4")
        de.gematik.ws.conn.signatureservice.v7.ExternalAuthenticate parameter
    ) throws FaultMessage;
}
