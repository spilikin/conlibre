
package de.gematik.ws.conn.cardterminalservice.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}CtId"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/CardServiceCommon/v2.0}SlotId"/&gt;
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
    "ctId",
    "slotId"
})
@XmlRootElement(name = "Slot")
public class Slot {

    @XmlElement(name = "CtId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    protected String ctId;
    @XmlElement(name = "SlotId", namespace = "http://ws.gematik.de/conn/CardServiceCommon/v2.0", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger slotId;

    /**
     * Gets the value of the ctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtId() {
        return ctId;
    }

    /**
     * Sets the value of the ctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtId(String value) {
        this.ctId = value;
    }

    /**
     * Gets the value of the slotId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlotId() {
        return slotId;
    }

    /**
     * Sets the value of the slotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlotId(BigInteger value) {
        this.slotId = value;
    }

}
