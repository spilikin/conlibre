
package de.gematik.ws.conn.certificateservicecommon.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCertificateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCertificateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckCertificateDetail" type="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}CheckCertificateDetailEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCertificateDetailsType", propOrder = {
    "checkCertificateDetail"
})
public class CheckCertificateDetailsType {

    @XmlElement(name = "CheckCertificateDetail")
    @XmlSchemaType(name = "token")
    protected List<CheckCertificateDetailEnum> checkCertificateDetail;

    /**
     * Gets the value of the checkCertificateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkCertificateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckCertificateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckCertificateDetailEnum }
     * 
     * 
     */
    public List<CheckCertificateDetailEnum> getCheckCertificateDetail() {
        if (checkCertificateDetail == null) {
            checkCertificateDetail = new ArrayList<CheckCertificateDetailEnum>();
        }
        return this.checkCertificateDetail;
    }

}
