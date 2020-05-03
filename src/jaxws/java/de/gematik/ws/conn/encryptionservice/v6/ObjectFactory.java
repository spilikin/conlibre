
package de.gematik.ws.conn.encryptionservice.v6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import oasis.names.tc.dss._1_0.core.schema.PropertiesType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.encryptionservice.v6 package. 
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

    private final static QName _CertificateOnCard_QNAME = new QName("http://ws.gematik.de/conn/EncryptionService/v6.1", "CertificateOnCard");
    private final static QName _PrivateKeyOnCard_QNAME = new QName("http://ws.gematik.de/conn/EncryptionService/v6.1", "PrivateKeyOnCard");
    private final static QName _Certificate_QNAME = new QName("http://ws.gematik.de/conn/EncryptionService/v6.1", "Certificate");
    private final static QName _EncryptionType_QNAME = new QName("http://ws.gematik.de/conn/EncryptionService/v6.1", "EncryptionType");
    private final static QName _UnprotectedProperties_QNAME = new QName("http://ws.gematik.de/conn/EncryptionService/v6.1", "UnprotectedProperties");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.encryptionservice.v6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncryptDocument }
     * 
     */
    public EncryptDocument createEncryptDocument() {
        return new EncryptDocument();
    }

    /**
     * Create an instance of {@link EncryptDocument.RecipientKeys }
     * 
     */
    public EncryptDocument.RecipientKeys createEncryptDocumentRecipientKeys() {
        return new EncryptDocument.RecipientKeys();
    }

    /**
     * Create an instance of {@link EncryptDocument.OptionalInputs }
     * 
     */
    public EncryptDocument.OptionalInputs createEncryptDocumentOptionalInputs() {
        return new EncryptDocument.OptionalInputs();
    }

    /**
     * Create an instance of {@link EncryptDocumentResponse }
     * 
     */
    public EncryptDocumentResponse createEncryptDocumentResponse() {
        return new EncryptDocumentResponse();
    }

    /**
     * Create an instance of {@link KeyOnCardType }
     * 
     */
    public KeyOnCardType createKeyOnCardType() {
        return new KeyOnCardType();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link DecryptDocument }
     * 
     */
    public DecryptDocument createDecryptDocument() {
        return new DecryptDocument();
    }

    /**
     * Create an instance of {@link DecryptDocumentResponse }
     * 
     */
    public DecryptDocumentResponse createDecryptDocumentResponse() {
        return new DecryptDocumentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyOnCardType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyOnCardType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EncryptionService/v6.1", name = "CertificateOnCard")
    public JAXBElement<KeyOnCardType> createCertificateOnCard(KeyOnCardType value) {
        return new JAXBElement<KeyOnCardType>(_CertificateOnCard_QNAME, KeyOnCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyOnCardType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyOnCardType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EncryptionService/v6.1", name = "PrivateKeyOnCard")
    public JAXBElement<KeyOnCardType> createPrivateKeyOnCard(KeyOnCardType value) {
        return new JAXBElement<KeyOnCardType>(_PrivateKeyOnCard_QNAME, KeyOnCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EncryptionService/v6.1", name = "Certificate")
    public JAXBElement<byte[]> createCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_Certificate_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EncryptionService/v6.1", name = "EncryptionType")
    public JAXBElement<String> createEncryptionType(String value) {
        return new JAXBElement<String>(_EncryptionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/EncryptionService/v6.1", name = "UnprotectedProperties")
    public JAXBElement<PropertiesType> createUnprotectedProperties(PropertiesType value) {
        return new JAXBElement<PropertiesType>(_UnprotectedProperties_QNAME, PropertiesType.class, null, value);
    }

}
