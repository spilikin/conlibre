
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;


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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}CardHandle"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element name="OptionalInputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}SignatureSchemes" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}BinaryString"/&gt;
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
    "cardHandle",
    "context",
    "optionalInputs",
    "binaryString"
})
@XmlRootElement(name = "ExternalAuthenticate")
public class ExternalAuthenticate {

    @XmlElement(name = "CardHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String cardHandle;
    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "OptionalInputs")
    protected ExternalAuthenticate.OptionalInputs optionalInputs;
    @XmlElement(name = "BinaryString", required = true)
    protected BinaryDocumentType binaryString;

    /**
     * Gets the value of the cardHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHandle() {
        return cardHandle;
    }

    /**
     * Sets the value of the cardHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHandle(String value) {
        this.cardHandle = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAuthenticate.OptionalInputs }
     *     
     */
    public ExternalAuthenticate.OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAuthenticate.OptionalInputs }
     *     
     */
    public void setOptionalInputs(ExternalAuthenticate.OptionalInputs value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the binaryString property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDocumentType }
     *     
     */
    public BinaryDocumentType getBinaryString() {
        return binaryString;
    }

    /**
     * Sets the value of the binaryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDocumentType }
     *     
     */
    public void setBinaryString(BinaryDocumentType value) {
        this.binaryString = value;
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
     *       &lt;all&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}SignatureSchemes" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class OptionalInputs {

        @XmlElement(name = "SignatureType", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        @XmlSchemaType(name = "anyURI")
        protected String signatureType;
        @XmlElement(name = "SignatureSchemes")
        protected String signatureSchemes;

        /**
         * Gets the value of the signatureType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureType() {
            return signatureType;
        }

        /**
         * Sets the value of the signatureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureType(String value) {
            this.signatureType = value;
        }

        /**
         * Gets the value of the signatureSchemes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureSchemes() {
            return signatureSchemes;
        }

        /**
         * Sets the value of the signatureSchemes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureSchemes(String value) {
            this.signatureSchemes = value;
        }

    }

}
