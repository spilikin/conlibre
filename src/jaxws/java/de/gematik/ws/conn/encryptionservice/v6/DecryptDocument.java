
package de.gematik.ws.conn.encryptionservice.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.DocumentType;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/EncryptionService/v6.1}PrivateKeyOnCard"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Document"/&gt;
 *         &lt;element name="OptionalInputs" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "privateKeyOnCard",
    "document",
    "optionalInputs"
})
@XmlRootElement(name = "DecryptDocument")
public class DecryptDocument {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "PrivateKeyOnCard", required = true)
    protected KeyOnCardType privateKeyOnCard;
    @XmlElement(name = "Document", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected DocumentType document;
    @XmlElement(name = "OptionalInputs")
    protected Object optionalInputs;

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
     * Gets the value of the privateKeyOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link KeyOnCardType }
     *     
     */
    public KeyOnCardType getPrivateKeyOnCard() {
        return privateKeyOnCard;
    }

    /**
     * Sets the value of the privateKeyOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyOnCardType }
     *     
     */
    public void setPrivateKeyOnCard(KeyOnCardType value) {
        this.privateKeyOnCard = value;
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
     *     {@link Object }
     *     
     */
    public Object getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOptionalInputs(Object value) {
        this.optionalInputs = value;
    }

}
