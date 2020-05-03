
package de.gematik.ws.conn.signatureservice.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="SignatureValueReference" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="IdRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "signatureValueReference"
})
@XmlRootElement(name = "CounterSignatureMarker")
public class CounterSignatureMarker {

    @XmlElement(name = "SignatureValueReference", required = true)
    protected List<CounterSignatureMarker.SignatureValueReference> signatureValueReference;

    /**
     * Gets the value of the signatureValueReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureValueReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureValueReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterSignatureMarker.SignatureValueReference }
     * 
     * 
     */
    public List<CounterSignatureMarker.SignatureValueReference> getSignatureValueReference() {
        if (signatureValueReference == null) {
            signatureValueReference = new ArrayList<CounterSignatureMarker.SignatureValueReference>();
        }
        return this.signatureValueReference;
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
     *       &lt;attribute name="IdRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureValueReference {

        @XmlAttribute(name = "IdRef")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object idRef;

        /**
         * Gets the value of the idRef property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getIdRef() {
            return idRef;
        }

        /**
         * Sets the value of the idRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIdRef(Object value) {
            this.idRef = value;
        }

    }

}
