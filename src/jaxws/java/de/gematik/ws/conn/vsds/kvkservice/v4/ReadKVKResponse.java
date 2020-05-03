
package de.gematik.ws.conn.vsds.kvkservice.v4;

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
 *         &lt;element name="KVK" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "kvk"
})
@XmlRootElement(name = "ReadKVKResponse")
public class ReadKVKResponse {

    @XmlElement(name = "KVK")
    protected byte[] kvk;

    /**
     * Gets the value of the kvk property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKVK() {
        return kvk;
    }

    /**
     * Sets the value of the kvk property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKVK(byte[] value) {
        this.kvk = value;
    }

}
