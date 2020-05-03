
package de.gematik.ws.conn.signatureservice.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.AttachmentType;


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
 *         &lt;element name="XslStyleSheets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}XslStylesheet" maxOccurs="unbounded"/&gt;
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
    "xslStyleSheets"
})
@XmlRootElement(name = "ViewerInfo")
public class ViewerInfo {

    @XmlElement(name = "XslStyleSheets")
    protected ViewerInfo.XslStyleSheets xslStyleSheets;

    /**
     * Gets the value of the xslStyleSheets property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerInfo.XslStyleSheets }
     *     
     */
    public ViewerInfo.XslStyleSheets getXslStyleSheets() {
        return xslStyleSheets;
    }

    /**
     * Sets the value of the xslStyleSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerInfo.XslStyleSheets }
     *     
     */
    public void setXslStyleSheets(ViewerInfo.XslStyleSheets value) {
        this.xslStyleSheets = value;
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
     *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}XslStylesheet" maxOccurs="unbounded"/&gt;
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
        "xslStylesheet"
    })
    public static class XslStyleSheets {

        @XmlElement(name = "XslStylesheet", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
        protected List<AttachmentType> xslStylesheet;

        /**
         * Gets the value of the xslStylesheet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the xslStylesheet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getXslStylesheet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * 
         * 
         */
        public List<AttachmentType> getXslStylesheet() {
            if (xslStylesheet == null) {
                xslStylesheet = new ArrayList<AttachmentType>();
            }
            return this.xslStylesheet;
        }

    }

}
