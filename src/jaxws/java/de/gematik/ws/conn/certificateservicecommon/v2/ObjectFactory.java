
package de.gematik.ws.conn.certificateservicecommon.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.certificateservicecommon.v2 package. 
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

    private final static QName _X509DataInfoList_QNAME = new QName("http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", "X509DataInfoList");
    private final static QName _CheckCertificateDetails_QNAME = new QName("http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", "CheckCertificateDetails");
    private final static QName _X509Certificate_QNAME = new QName("http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", "X509Certificate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.certificateservicecommon.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link X509DataInfoListType }
     * 
     */
    public X509DataInfoListType createX509DataInfoListType() {
        return new X509DataInfoListType();
    }

    /**
     * Create an instance of {@link X509DataInfoListType.X509DataInfo }
     * 
     */
    public X509DataInfoListType.X509DataInfo createX509DataInfoListTypeX509DataInfo() {
        return new X509DataInfoListType.X509DataInfo();
    }

    /**
     * Create an instance of {@link X509DataInfoListType.X509DataInfo.X509Data }
     * 
     */
    public X509DataInfoListType.X509DataInfo.X509Data createX509DataInfoListTypeX509DataInfoX509Data() {
        return new X509DataInfoListType.X509DataInfo.X509Data();
    }

    /**
     * Create an instance of {@link CheckCertificateDetailsType }
     * 
     */
    public CheckCertificateDetailsType createCheckCertificateDetailsType() {
        return new CheckCertificateDetailsType();
    }

    /**
     * Create an instance of {@link X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial }
     * 
     */
    public X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial createX509DataInfoListTypeX509DataInfoX509DataX509IssuerSerial() {
        return new X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataInfoListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509DataInfoListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", name = "X509DataInfoList")
    public JAXBElement<X509DataInfoListType> createX509DataInfoList(X509DataInfoListType value) {
        return new JAXBElement<X509DataInfoListType>(_X509DataInfoList_QNAME, X509DataInfoListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCertificateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckCertificateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", name = "CheckCertificateDetails")
    public JAXBElement<CheckCertificateDetailsType> createCheckCertificateDetails(CheckCertificateDetailsType value) {
        return new JAXBElement<CheckCertificateDetailsType>(_CheckCertificateDetails_QNAME, CheckCertificateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CertificateServiceCommon/v2.0", name = "X509Certificate")
    public JAXBElement<byte[]> createX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509Certificate_QNAME, byte[].class, null, ((byte[]) value));
    }

}
