
package oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AttributeCertificateContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeCertificateContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Holder" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}EntityType"/&gt;
 *         &lt;element name="Issuer" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}EntityType"/&gt;
 *         &lt;element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AttCertValidityPeriod" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}ValidityPeriodType"/&gt;
 *         &lt;element name="Attributes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="Attribute" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}AttributeType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IssuerUniqueID" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeCertificateContentType", propOrder = {
    "version",
    "holder",
    "issuer",
    "signatureAlgorithm",
    "serialNumber",
    "attCertValidityPeriod",
    "attributes",
    "issuerUniqueID",
    "extensions"
})
public class AttributeCertificateContentType {

    @XmlElement(name = "Version")
    protected BigInteger version;
    @XmlElement(name = "Holder", required = true)
    protected EntityType holder;
    @XmlElement(name = "Issuer", required = true)
    protected EntityType issuer;
    @XmlElement(name = "SignatureAlgorithm", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String signatureAlgorithm;
    @XmlElement(name = "SerialNumber", required = true)
    protected BigInteger serialNumber;
    @XmlElement(name = "AttCertValidityPeriod", required = true)
    protected ValidityPeriodType attCertValidityPeriod;
    @XmlElement(name = "Attributes", required = true)
    protected AttributeCertificateContentType.Attributes attributes;
    @XmlElement(name = "IssuerUniqueID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] issuerUniqueID;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setHolder(EntityType value) {
        this.holder = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setIssuer(EntityType value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSerialNumber(BigInteger value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the attCertValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType }
     *     
     */
    public ValidityPeriodType getAttCertValidityPeriod() {
        return attCertValidityPeriod;
    }

    /**
     * Sets the value of the attCertValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType }
     *     
     */
    public void setAttCertValidityPeriod(ValidityPeriodType value) {
        this.attCertValidityPeriod = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCertificateContentType.Attributes }
     *     
     */
    public AttributeCertificateContentType.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCertificateContentType.Attributes }
     *     
     */
    public void setAttributes(AttributeCertificateContentType.Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the issuerUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIssuerUniqueID() {
        return issuerUniqueID;
    }

    /**
     * Sets the value of the issuerUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerUniqueID(byte[] value) {
        this.issuerUniqueID = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="Attribute" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}AttributeType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class Attributes {

        @XmlElement(name = "Attribute")
        protected List<AttributeType> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        public List<AttributeType> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<AttributeType>();
            }
            return this.attribute;
        }

    }

}
