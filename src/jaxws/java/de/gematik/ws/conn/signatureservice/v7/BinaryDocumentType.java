
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.Base64Data;
import oasis.names.tc.dss._1_0.core.schema.DocumentBaseType;


/**
 * <p>Java class for BinaryDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Data"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryDocumentType", propOrder = {
    "base64Data"
})
public class BinaryDocumentType
    extends DocumentBaseType
{

    @XmlElement(name = "Base64Data", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", required = true)
    protected Base64Data base64Data;

    /**
     * Gets the value of the base64Data property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Data }
     *     
     */
    public Base64Data getBase64Data() {
        return base64Data;
    }

    /**
     * Sets the value of the base64Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Data }
     *     
     */
    public void setBase64Data(Base64Data value) {
        this.base64Data = value;
    }

}
