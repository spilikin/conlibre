
package de.gematik.ws.conn.encryptionservice.v6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.DocumentType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import oasis.names.tc.dss._1_0.core.schema.PropertiesType;


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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element name="RecipientKeys"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}CertificateOnCard" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Document"/&gt;
 *         &lt;element name="OptionalInputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}EncryptionType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}Element" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}UnprotectedProperties" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
    "context",
    "recipientKeys",
    "document",
    "optionalInputs"
})
@XmlRootElement(name = "EncryptDocument")
public class EncryptDocument {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "RecipientKeys", required = true)
    protected EncryptDocument.RecipientKeys recipientKeys;
    @XmlElement(name = "Document", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected DocumentType document;
    @XmlElement(name = "OptionalInputs")
    protected EncryptDocument.OptionalInputs optionalInputs;

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
     * Gets the value of the recipientKeys property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptDocument.RecipientKeys }
     *     
     */
    public EncryptDocument.RecipientKeys getRecipientKeys() {
        return recipientKeys;
    }

    /**
     * Sets the value of the recipientKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptDocument.RecipientKeys }
     *     
     */
    public void setRecipientKeys(EncryptDocument.RecipientKeys value) {
        this.recipientKeys = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptDocument.OptionalInputs }
     *     
     */
    public EncryptDocument.OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptDocument.OptionalInputs }
     *     
     */
    public void setOptionalInputs(EncryptDocument.OptionalInputs value) {
        this.optionalInputs = value;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}EncryptionType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}Element" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}UnprotectedProperties" minOccurs="0"/&gt;
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
        "encryptionType",
        "element",
        "unprotectedProperties"
    })
    public static class OptionalInputs {

        @XmlElement(name = "EncryptionType")
        protected String encryptionType;
        @XmlElement(name = "Element")
        protected List<Element> element;
        @XmlElement(name = "UnprotectedProperties")
        protected PropertiesType unprotectedProperties;

        /**
         * Gets the value of the encryptionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptionType() {
            return encryptionType;
        }

        /**
         * Sets the value of the encryptionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptionType(String value) {
            this.encryptionType = value;
        }

        /**
         * Gets the value of the element property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getElement() {
            if (element == null) {
                element = new ArrayList<Element>();
            }
            return this.element;
        }

        /**
         * Gets the value of the unprotectedProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PropertiesType }
         *     
         */
        public PropertiesType getUnprotectedProperties() {
            return unprotectedProperties;
        }

        /**
         * Sets the value of the unprotectedProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropertiesType }
         *     
         */
        public void setUnprotectedProperties(PropertiesType value) {
            this.unprotectedProperties = value;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}CertificateOnCard" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "certificateOnCard",
        "certificate"
    })
    public static class RecipientKeys {

        @XmlElement(name = "CertificateOnCard")
        protected KeyOnCardType certificateOnCard;
        @XmlElement(name = "Certificate")
        protected List<byte[]> certificate;

        /**
         * Gets the value of the certificateOnCard property.
         * 
         * @return
         *     possible object is
         *     {@link KeyOnCardType }
         *     
         */
        public KeyOnCardType getCertificateOnCard() {
            return certificateOnCard;
        }

        /**
         * Sets the value of the certificateOnCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyOnCardType }
         *     
         */
        public void setCertificateOnCard(KeyOnCardType value) {
            this.certificateOnCard = value;
        }

        /**
         * Gets the value of the certificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the certificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * byte[]
         * 
         */
        public List<byte[]> getCertificate() {
            if (certificate == null) {
                certificate = new ArrayList<byte[]>();
            }
            return this.certificate;
        }

    }

}
