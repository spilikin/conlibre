
package oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_.SignedObjectIdentifierType;


/**
 * <p>Java class for VerifiedUnderSignaturePolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifiedUnderSignaturePolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}SignaturePolicy"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}SignatureIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifiedUnderSignaturePolicyType", propOrder = {
    "signaturePolicy",
    "signatureIdentifier"
})
public class VerifiedUnderSignaturePolicyType {

    @XmlElement(name = "SignaturePolicy", required = true)
    protected SignaturePolicyDetailsType signaturePolicy;
    @XmlElement(name = "SignatureIdentifier")
    protected SignedObjectIdentifierType signatureIdentifier;

    /**
     * Gets the value of the signaturePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyDetailsType }
     *     
     */
    public SignaturePolicyDetailsType getSignaturePolicy() {
        return signaturePolicy;
    }

    /**
     * Sets the value of the signaturePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyDetailsType }
     *     
     */
    public void setSignaturePolicy(SignaturePolicyDetailsType value) {
        this.signaturePolicy = value;
    }

    /**
     * Gets the value of the signatureIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SignedObjectIdentifierType }
     *     
     */
    public SignedObjectIdentifierType getSignatureIdentifier() {
        return signatureIdentifier;
    }

    /**
     * Sets the value of the signatureIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedObjectIdentifierType }
     *     
     */
    public void setSignatureIdentifier(SignedObjectIdentifierType value) {
        this.signatureIdentifier = value;
    }

}
