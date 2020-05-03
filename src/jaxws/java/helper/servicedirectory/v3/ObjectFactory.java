
package helper.servicedirectory.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the helper.dev.spilikin.conlibre.servicedirectory.v3 package. 
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

    private final static QName _ServiceDirectoryRequest_QNAME = new QName("helper/ServiceDirectory/v3.1", "ServiceDirectoryRequest");
    private final static QName _Fault_QNAME = new QName("helper/ServiceDirectory/v3.1", "Fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: helper.dev.spilikin.conlibre.servicedirectory.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "helper/ServiceDirectory/v3.1", name = "ServiceDirectoryRequest")
    public JAXBElement<Object> createServiceDirectoryRequest(Object value) {
        return new JAXBElement<Object>(_ServiceDirectoryRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "helper/ServiceDirectory/v3.1", name = "Fault")
    public JAXBElement<Object> createFault(Object value) {
        return new JAXBElement<Object>(_Fault_QNAME, Object.class, null, value);
    }

}
