
package de.gematik.ws.conn.vsds.vsdservice.v5;

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
 *         &lt;element name="PersoenlicheVersichertendaten" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="AllgemeineVersicherungsdaten" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="GeschuetzteVersichertendaten" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="VSD_Status" type="{http://ws.gematik.de/conn/vsds/VSDService/v5.2}VSD_StatusType"/&gt;
 *         &lt;element name="Pruefungsnachweis" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
    "persoenlicheVersichertendaten",
    "allgemeineVersicherungsdaten",
    "geschuetzteVersichertendaten",
    "vsdStatus",
    "pruefungsnachweis"
})
@XmlRootElement(name = "ReadVSDResponse")
public class ReadVSDResponse {

    @XmlElement(name = "PersoenlicheVersichertendaten", required = true)
    protected byte[] persoenlicheVersichertendaten;
    @XmlElement(name = "AllgemeineVersicherungsdaten", required = true)
    protected byte[] allgemeineVersicherungsdaten;
    @XmlElement(name = "GeschuetzteVersichertendaten")
    protected byte[] geschuetzteVersichertendaten;
    @XmlElement(name = "VSD_Status", required = true)
    protected VSDStatusType vsdStatus;
    @XmlElement(name = "Pruefungsnachweis")
    protected byte[] pruefungsnachweis;

    /**
     * Gets the value of the persoenlicheVersichertendaten property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPersoenlicheVersichertendaten() {
        return persoenlicheVersichertendaten;
    }

    /**
     * Sets the value of the persoenlicheVersichertendaten property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPersoenlicheVersichertendaten(byte[] value) {
        this.persoenlicheVersichertendaten = value;
    }

    /**
     * Gets the value of the allgemeineVersicherungsdaten property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAllgemeineVersicherungsdaten() {
        return allgemeineVersicherungsdaten;
    }

    /**
     * Sets the value of the allgemeineVersicherungsdaten property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAllgemeineVersicherungsdaten(byte[] value) {
        this.allgemeineVersicherungsdaten = value;
    }

    /**
     * Gets the value of the geschuetzteVersichertendaten property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGeschuetzteVersichertendaten() {
        return geschuetzteVersichertendaten;
    }

    /**
     * Sets the value of the geschuetzteVersichertendaten property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGeschuetzteVersichertendaten(byte[] value) {
        this.geschuetzteVersichertendaten = value;
    }

    /**
     * Gets the value of the vsdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VSDStatusType }
     *     
     */
    public VSDStatusType getVSDStatus() {
        return vsdStatus;
    }

    /**
     * Sets the value of the vsdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VSDStatusType }
     *     
     */
    public void setVSDStatus(VSDStatusType value) {
        this.vsdStatus = value;
    }

    /**
     * Gets the value of the pruefungsnachweis property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPruefungsnachweis() {
        return pruefungsnachweis;
    }

    /**
     * Sets the value of the pruefungsnachweis property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPruefungsnachweis(byte[] value) {
        this.pruefungsnachweis = value;
    }

}
