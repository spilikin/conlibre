
package de.gematik.ws.conn.certificateservice.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CertificateExpirationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateExpirationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CtID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}CardHandle"/&gt;
 *         &lt;element name="ICCSN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subject_commonName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateExpirationType", propOrder = {
    "ctID",
    "cardHandle",
    "iccsn",
    "subjectCommonName",
    "serialNumber",
    "validity"
})
public class CertificateExpirationType {

    @XmlElement(name = "CtID", required = true)
    protected String ctID;
    @XmlElement(name = "CardHandle", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected String cardHandle;
    @XmlElement(name = "ICCSN", required = true)
    protected String iccsn;
    @XmlElement(name = "subject_commonName", required = true)
    protected String subjectCommonName;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validity;

    /**
     * Gets the value of the ctID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtID() {
        return ctID;
    }

    /**
     * Sets the value of the ctID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtID(String value) {
        this.ctID = value;
    }

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
     * Gets the value of the iccsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCSN() {
        return iccsn;
    }

    /**
     * Sets the value of the iccsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCSN(String value) {
        this.iccsn = value;
    }

    /**
     * Gets the value of the subjectCommonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCommonName() {
        return subjectCommonName;
    }

    /**
     * Sets the value of the subjectCommonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCommonName(String value) {
        this.subjectCommonName = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidity(XMLGregorianCalendar value) {
        this.validity = value;
    }

}
