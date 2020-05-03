
package de.gematik.ws.conn.nfds.nfdservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}EhcHandle"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}HpcHandle"/&gt;
 *         &lt;element name="NFDDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "ehcHandle",
    "hpcHandle",
    "nfdDocument"
})
@XmlRootElement(name = "WriteNFD")
public class WriteNFD {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "EhcHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String ehcHandle;
    @XmlElement(name = "HpcHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String hpcHandle;
    @XmlElement(name = "NFDDocument", required = true)
    protected byte[] nfdDocument;

    /**
     * Angaben zum Aufrufkontext
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
     * Verweis auf die eGK, auf die der NFD geschrieben werden soll
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhcHandle() {
        return ehcHandle;
    }

    /**
     * Sets the value of the ehcHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhcHandle(String value) {
        this.ehcHandle = value;
    }

    /**
     * Verweis auf die HBA/SMC-B, die zum Zugriff auf die eGK verwendet werden soll
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpcHandle() {
        return hpcHandle;
    }

    /**
     * Sets the value of the hpcHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpcHandle(String value) {
        this.hpcHandle = value;
    }

    /**
     * Gets the value of the nfdDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNFDDocument() {
        return nfdDocument;
    }

    /**
     * Sets the value of the nfdDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNFDDocument(byte[] value) {
        this.nfdDocument = value;
    }

}
