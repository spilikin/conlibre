
package oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupportedSignaturePolicy" type="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}SignaturePolicyDetailsType" maxOccurs="unbounded"/&gt;
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
    "supportedSignaturePolicy"
})
@XmlRootElement(name = "SupportedSignaturePolicies")
public class SupportedSignaturePolicies {

    @XmlElement(name = "SupportedSignaturePolicy", required = true)
    protected List<SignaturePolicyDetailsType> supportedSignaturePolicy;

    /**
     * Gets the value of the supportedSignaturePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedSignaturePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedSignaturePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignaturePolicyDetailsType }
     * 
     * 
     */
    public List<SignaturePolicyDetailsType> getSupportedSignaturePolicy() {
        if (supportedSignaturePolicy == null) {
            supportedSignaturePolicy = new ArrayList<SignaturePolicyDetailsType>();
        }
        return this.supportedSignaturePolicy;
    }

}
