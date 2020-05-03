
package de.gematik.ws.conn.vsds.vsdservice.v5;

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
 *         &lt;element name="EhcHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HpcHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PerformOnlineCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReadOnlineReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
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
    "ehcHandle",
    "hpcHandle",
    "performOnlineCheck",
    "readOnlineReceipt",
    "context"
})
@XmlRootElement(name = "ReadVSD")
public class ReadVSD {

    @XmlElement(name = "EhcHandle", required = true)
    protected String ehcHandle;
    @XmlElement(name = "HpcHandle", required = true)
    protected String hpcHandle;
    @XmlElement(name = "PerformOnlineCheck")
    protected boolean performOnlineCheck;
    @XmlElement(name = "ReadOnlineReceipt")
    protected boolean readOnlineReceipt;
    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;

    /**
     * Gets the value of the ehcHandle property.
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
     * Gets the value of the hpcHandle property.
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
     * Gets the value of the performOnlineCheck property.
     * 
     */
    public boolean isPerformOnlineCheck() {
        return performOnlineCheck;
    }

    /**
     * Sets the value of the performOnlineCheck property.
     * 
     */
    public void setPerformOnlineCheck(boolean value) {
        this.performOnlineCheck = value;
    }

    /**
     * Gets the value of the readOnlineReceipt property.
     * 
     */
    public boolean isReadOnlineReceipt() {
        return readOnlineReceipt;
    }

    /**
     * Sets the value of the readOnlineReceipt property.
     * 
     */
    public void setReadOnlineReceipt(boolean value) {
        this.readOnlineReceipt = value;
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

}
