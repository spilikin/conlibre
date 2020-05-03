
package de.gematik.ws.conn.serviceinformation.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.serviceinformation.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Abstract_QNAME = new QName("http://ws.gematik.de/conn/ServiceInformation/v2.0", "Abstract");
    private final static QName _ServiceInformation_QNAME = new QName("http://ws.gematik.de/conn/ServiceInformation/v2.0", "ServiceInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.serviceinformation.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicesType }
     * 
     */
    public ServicesType createServicesType() {
        return new ServicesType();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     */
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link WSDLLocationType }
     * 
     */
    public WSDLLocationType createWSDLLocationType() {
        return new WSDLLocationType();
    }

    /**
     * Create an instance of {@link VersionType }
     * 
     */
    public VersionType createVersionType() {
        return new VersionType();
    }

    /**
     * Create an instance of {@link VersionsType }
     * 
     */
    public VersionsType createVersionsType() {
        return new VersionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ServiceInformation/v2.0", name = "Abstract")
    public JAXBElement<String> createAbstract(String value) {
        return new JAXBElement<String>(_Abstract_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServicesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/ServiceInformation/v2.0", name = "ServiceInformation")
    public JAXBElement<ServicesType> createServiceInformation(ServicesType value) {
        return new JAXBElement<ServicesType>(_ServiceInformation_QNAME, ServicesType.class, null, value);
    }

}
