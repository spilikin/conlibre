
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VerificationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighLevelResult"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="VALID"/&gt;
 *               &lt;enumeration value="INCONCLUSIVE"/&gt;
 *               &lt;enumeration value="INVALID"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimestampType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="SIGNATURE_EMBEDDED_TIMESTAMP"/&gt;
 *               &lt;enumeration value="QUALIFIED_TIMESTAMP"/&gt;
 *               &lt;enumeration value="USER_DEFINED_TIMESTAMP"/&gt;
 *               &lt;enumeration value="SYSTEM_TIMESTAMP"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationResultType", propOrder = {
    "highLevelResult",
    "timestampType",
    "timestamp"
})
public class VerificationResultType {

    @XmlElement(name = "HighLevelResult", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String highLevelResult;
    @XmlElement(name = "TimestampType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timestampType;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the highLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighLevelResult() {
        return highLevelResult;
    }

    /**
     * Sets the value of the highLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighLevelResult(String value) {
        this.highLevelResult = value;
    }

    /**
     * Gets the value of the timestampType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampType() {
        return timestampType;
    }

    /**
     * Sets the value of the timestampType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampType(String value) {
        this.timestampType = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
