package de.gematik.ws.conn.cardterminalservice.wsdl.v1_1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-02T19:08:11.999+02:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "CardTerminalService",
                  wsdlLocation = "classpath:META-INF/wsdl/api-telematik/conn/CardTerminalService.wsdl",
                  targetNamespace = "http://ws.gematik.de/conn/CardTerminalService/WSDL/v1.1")
public class CardTerminalService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.gematik.de/conn/CardTerminalService/WSDL/v1.1", "CardTerminalService");
    public final static QName CardTerminalServicePort = new QName("http://ws.gematik.de/conn/CardTerminalService/WSDL/v1.1", "CardTerminalServicePort");
    static {
        URL url = CardTerminalService.class.getClassLoader().getResource("META-INF/wsdl/api-telematik/conn/CardTerminalService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CardTerminalService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:META-INF/wsdl/api-telematik/conn/CardTerminalService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CardTerminalService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardTerminalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardTerminalService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CardTerminalService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CardTerminalService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CardTerminalService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CardTerminalServicePortType
     */
    @WebEndpoint(name = "CardTerminalServicePort")
    public CardTerminalServicePortType getCardTerminalServicePort() {
        return super.getPort(CardTerminalServicePort, CardTerminalServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardTerminalServicePortType
     */
    @WebEndpoint(name = "CardTerminalServicePort")
    public CardTerminalServicePortType getCardTerminalServicePort(WebServiceFeature... features) {
        return super.getPort(CardTerminalServicePort, CardTerminalServicePortType.class, features);
    }

}
