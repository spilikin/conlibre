
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for InlineXMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineXMLType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax'/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ignorePIs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ignoreComments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlineXMLType", propOrder = {
    "any"
})
public class InlineXMLType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "ignorePIs")
    protected Boolean ignorePIs;
    @XmlAttribute(name = "ignoreComments")
    protected Boolean ignoreComments;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the ignorePIs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnorePIs() {
        if (ignorePIs == null) {
            return true;
        } else {
            return ignorePIs;
        }
    }

    /**
     * Sets the value of the ignorePIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePIs(Boolean value) {
        this.ignorePIs = value;
    }

    /**
     * Gets the value of the ignoreComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreComments() {
        if (ignoreComments == null) {
            return true;
        } else {
            return ignoreComments;
        }
    }

    /**
     * Sets the value of the ignoreComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreComments(Boolean value) {
        this.ignoreComments = value;
    }

}
