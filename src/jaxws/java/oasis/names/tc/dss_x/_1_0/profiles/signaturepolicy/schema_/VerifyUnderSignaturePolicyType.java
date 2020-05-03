
package oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyUnderSignaturePolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyUnderSignaturePolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultPolicy" type="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}SignaturePolicyDetailsType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}ExplicitPolicies" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyUnderSignaturePolicyType", propOrder = {
    "defaultPolicy",
    "explicitPolicies"
})
public class VerifyUnderSignaturePolicyType {

    @XmlElement(name = "DefaultPolicy")
    protected SignaturePolicyDetailsType defaultPolicy;
    @XmlElement(name = "ExplicitPolicies")
    protected PolicySignaturePairsType explicitPolicies;

    /**
     * Gets the value of the defaultPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyDetailsType }
     *     
     */
    public SignaturePolicyDetailsType getDefaultPolicy() {
        return defaultPolicy;
    }

    /**
     * Sets the value of the defaultPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyDetailsType }
     *     
     */
    public void setDefaultPolicy(SignaturePolicyDetailsType value) {
        this.defaultPolicy = value;
    }

    /**
     * Gets the value of the explicitPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySignaturePairsType }
     *     
     */
    public PolicySignaturePairsType getExplicitPolicies() {
        return explicitPolicies;
    }

    /**
     * Sets the value of the explicitPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySignaturePairsType }
     *     
     */
    public void setExplicitPolicies(PolicySignaturePairsType value) {
        this.explicitPolicies = value;
    }

}
