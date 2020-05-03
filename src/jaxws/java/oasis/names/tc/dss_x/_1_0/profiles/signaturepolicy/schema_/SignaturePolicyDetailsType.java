
package oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_3.DigestAlgAndValueType;


/**
 * <p>Java class for SignaturePolicyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignaturePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="SignaturePolicyLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DigestAndAlgorithm" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyDetailsType", propOrder = {
    "signaturePolicyIdentifier",
    "signaturePolicyLocation",
    "digestAndAlgorithm"
})
public class SignaturePolicyDetailsType {

    @XmlElement(name = "SignaturePolicyIdentifier", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String signaturePolicyIdentifier;
    @XmlElement(name = "SignaturePolicyLocation")
    @XmlSchemaType(name = "anyURI")
    protected String signaturePolicyLocation;
    @XmlElement(name = "DigestAndAlgorithm")
    protected DigestAlgAndValueType digestAndAlgorithm;

    /**
     * Gets the value of the signaturePolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicyIdentifier() {
        return signaturePolicyIdentifier;
    }

    /**
     * Sets the value of the signaturePolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicyIdentifier(String value) {
        this.signaturePolicyIdentifier = value;
    }

    /**
     * Gets the value of the signaturePolicyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicyLocation() {
        return signaturePolicyLocation;
    }

    /**
     * Sets the value of the signaturePolicyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicyLocation(String value) {
        this.signaturePolicyLocation = value;
    }

    /**
     * Gets the value of the digestAndAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getDigestAndAlgorithm() {
        return digestAndAlgorithm;
    }

    /**
     * Sets the value of the digestAndAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setDigestAndAlgorithm(DigestAlgAndValueType value) {
        this.digestAndAlgorithm = value;
    }

}
