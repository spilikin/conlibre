package de.gematik.ws.conn.certificateservice.wsdl.v6_0;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-02T19:08:13.706+02:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "CertificateService",
                  wsdlLocation = "classpath:META-INF/wsdl/api-telematik/conn/CertificateService.wsdl",
                  targetNamespace = "http://ws.gematik.de/conn/CertificateService/WSDL/v6.0")
public class CertificateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.gematik.de/conn/CertificateService/WSDL/v6.0", "CertificateService");
    public final static QName CertificateServicePort = new QName("http://ws.gematik.de/conn/CertificateService/WSDL/v6.0", "CertificateServicePort");
    static {
        URL url = CertificateService.class.getClassLoader().getResource("META-INF/wsdl/api-telematik/conn/CertificateService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CertificateService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:META-INF/wsdl/api-telematik/conn/CertificateService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CertificateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CertificateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CertificateService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CertificateService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CertificateService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CertificateService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CertificateServicePortType
     */
    @WebEndpoint(name = "CertificateServicePort")
    public CertificateServicePortType getCertificateServicePort() {
        return super.getPort(CertificateServicePort, CertificateServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CertificateServicePortType
     */
    @WebEndpoint(name = "CertificateServicePort")
    public CertificateServicePortType getCertificateServicePort(WebServiceFeature... features) {
        return super.getPort(CertificateServicePort, CertificateServicePortType.class, features);
    }

}
