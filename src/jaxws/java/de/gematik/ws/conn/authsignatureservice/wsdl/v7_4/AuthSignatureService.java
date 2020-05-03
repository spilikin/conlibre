package de.gematik.ws.conn.authsignatureservice.wsdl.v7_4;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-02T19:08:08.268+02:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "AuthSignatureService",
                  wsdlLocation = "classpath:META-INF/wsdl/api-telematik/conn/AuthSignatureService.wsdl",
                  targetNamespace = "http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4")
public class AuthSignatureService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4", "AuthSignatureService");
    public final static QName AuthSignatureServicePort = new QName("http://ws.gematik.de/conn/AuthSignatureService/WSDL/v7.4", "AuthSignatureServicePort");
    static {
        URL url = AuthSignatureService.class.getClassLoader().getResource("META-INF/wsdl/api-telematik/conn/AuthSignatureService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(AuthSignatureService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:META-INF/wsdl/api-telematik/conn/AuthSignatureService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AuthSignatureService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthSignatureService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthSignatureService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AuthSignatureService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AuthSignatureService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AuthSignatureService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AuthSignatureServicePortType
     */
    @WebEndpoint(name = "AuthSignatureServicePort")
    public AuthSignatureServicePortType getAuthSignatureServicePort() {
        return super.getPort(AuthSignatureServicePort, AuthSignatureServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthSignatureServicePortType
     */
    @WebEndpoint(name = "AuthSignatureServicePort")
    public AuthSignatureServicePortType getAuthSignatureServicePort(WebServiceFeature... features) {
        return super.getPort(AuthSignatureServicePort, AuthSignatureServicePortType.class, features);
    }

}
