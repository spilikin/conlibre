
package de.gematik.ws.conn.nfds.dpeservice.v1;

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
 *         &lt;element ref="{http://ws.gematik.de/conn/nfds/DPEService/v1.0}Status"/&gt;
 *         &lt;element name="DPEDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "status",
    "dpeDocument"
})
@XmlRootElement(name = "ReadDPEResponse")
public class ReadDPEResponse {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "DPEDocument", required = true)
    protected byte[] dpeDocument;

    /**
     * Statusrückmeldung
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the dpeDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDPEDocument() {
        return dpeDocument;
    }

    /**
     * Sets the value of the dpeDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDPEDocument(byte[] value) {
        this.dpeDocument = value;
    }

}
