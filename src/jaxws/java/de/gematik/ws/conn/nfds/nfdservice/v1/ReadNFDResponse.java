
package de.gematik.ws.conn.nfds.nfdservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.signatureservice.v7.VerificationResultType;
import oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_.VerificationReportType;


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
 *         &lt;element ref="{http://ws.gematik.de/conn/nfds/NFDService/v1.0}Status"/&gt;
 *         &lt;element name="NFDDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}VerificationReport"/&gt;
 *         &lt;element name="VerificationResult" type="{http://ws.gematik.de/conn/SignatureService/v7.4}VerificationResultType"/&gt;
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
    "nfdDocument",
    "verificationReport",
    "verificationResult"
})
@XmlRootElement(name = "ReadNFDResponse")
public class ReadNFDResponse {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "NFDDocument", required = true)
    protected byte[] nfdDocument;
    @XmlElement(name = "VerificationReport", namespace = "urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#", required = true)
    protected VerificationReportType verificationReport;
    @XmlElement(name = "VerificationResult", required = true)
    protected VerificationResultType verificationResult;

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
     * Gets the value of the nfdDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNFDDocument() {
        return nfdDocument;
    }

    /**
     * Sets the value of the nfdDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNFDDocument(byte[] value) {
        this.nfdDocument = value;
    }

    /**
     * Prüfbericht der QES-Prüfung des NFD gemäß [OASIS-VR].
     * 
     * @return
     *     possible object is
     *     {@link VerificationReportType }
     *     
     */
    public VerificationReportType getVerificationReport() {
        return verificationReport;
    }

    /**
     * Sets the value of the verificationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReportType }
     *     
     */
    public void setVerificationReport(VerificationReportType value) {
        this.verificationReport = value;
    }

    /**
     * Gets the value of the verificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationResultType }
     *     
     */
    public VerificationResultType getVerificationResult() {
        return verificationResult;
    }

    /**
     * Sets the value of the verificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationResultType }
     *     
     */
    public void setVerificationResult(VerificationResultType value) {
        this.verificationResult = value;
    }

}
