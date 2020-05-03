
package oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.etsi.uri._01903.v1_3.CRLIdentifierType;


/**
 * <p>Java class for CRLValidityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRLValidityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}CRLIdentifierType"/&gt;
 *         &lt;element name="CRLValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="CRLContent" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}CRLContentType" minOccurs="0"/&gt;
 *         &lt;element name="SignatureOK" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}SignatureValidityType"/&gt;
 *         &lt;element name="CertificatePathValidity" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}CertificatePathValidityType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLValidityType", propOrder = {
    "crlIdentifier",
    "crlValue",
    "crlContent",
    "signatureOK",
    "certificatePathValidity"
})
public class CRLValidityType {

    @XmlElement(name = "CRLIdentifier", required = true)
    protected CRLIdentifierType crlIdentifier;
    @XmlElement(name = "CRLValue")
    protected byte[] crlValue;
    @XmlElement(name = "CRLContent")
    protected CRLContentType crlContent;
    @XmlElement(name = "SignatureOK", required = true)
    protected SignatureValidityType signatureOK;
    @XmlElement(name = "CertificatePathValidity", required = true)
    protected CertificatePathValidityType certificatePathValidity;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the crlIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CRLIdentifierType }
     *     
     */
    public CRLIdentifierType getCRLIdentifier() {
        return crlIdentifier;
    }

    /**
     * Sets the value of the crlIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLIdentifierType }
     *     
     */
    public void setCRLIdentifier(CRLIdentifierType value) {
        this.crlIdentifier = value;
    }

    /**
     * Gets the value of the crlValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCRLValue() {
        return crlValue;
    }

    /**
     * Sets the value of the crlValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCRLValue(byte[] value) {
        this.crlValue = value;
    }

    /**
     * Gets the value of the crlContent property.
     * 
     * @return
     *     possible object is
     *     {@link CRLContentType }
     *     
     */
    public CRLContentType getCRLContent() {
        return crlContent;
    }

    /**
     * Sets the value of the crlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLContentType }
     *     
     */
    public void setCRLContent(CRLContentType value) {
        this.crlContent = value;
    }

    /**
     * Gets the value of the signatureOK property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidityType }
     *     
     */
    public SignatureValidityType getSignatureOK() {
        return signatureOK;
    }

    /**
     * Sets the value of the signatureOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidityType }
     *     
     */
    public void setSignatureOK(SignatureValidityType value) {
        this.signatureOK = value;
    }

    /**
     * Gets the value of the certificatePathValidity property.
     * 
     * @return
     *     possible object is
     *     {@link CertificatePathValidityType }
     *     
     */
    public CertificatePathValidityType getCertificatePathValidity() {
        return certificatePathValidity;
    }

    /**
     * Sets the value of the certificatePathValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificatePathValidityType }
     *     
     */
    public void setCertificatePathValidity(CertificatePathValidityType value) {
        this.certificatePathValidity = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
