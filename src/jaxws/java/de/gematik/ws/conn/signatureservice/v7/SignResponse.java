
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import oasis.names.tc.dss._1_0.core.schema.SignatureObject;
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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorCommon/v5.0}Status"/&gt;
 *         &lt;element name="OptionalOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}DocumentWithSignature" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}VerificationReport" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RequestID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "optionalOutputs",
    "signatureObject"
})
@XmlRootElement(name = "SignResponse")
public class SignResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "OptionalOutputs")
    protected SignResponse.OptionalOutputs optionalOutputs;
    @XmlElement(name = "SignatureObject", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected SignatureObject signatureObject;
    @XmlAttribute(name = "RequestID", required = true)
    protected String requestID;

    /**
     * Gets the value of the status property.
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
     * Gets the value of the optionalOutputs property.
     * 
     * @return
     *     possible object is
     *     {@link SignResponse.OptionalOutputs }
     *     
     */
    public SignResponse.OptionalOutputs getOptionalOutputs() {
        return optionalOutputs;
    }

    /**
     * Sets the value of the optionalOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignResponse.OptionalOutputs }
     *     
     */
    public void setOptionalOutputs(SignResponse.OptionalOutputs value) {
        this.optionalOutputs = value;
    }

    /**
     * Gets the value of the signatureObject property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureObject }
     *     
     */
    public SignatureObject getSignatureObject() {
        return signatureObject;
    }

    /**
     * Sets the value of the signatureObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureObject }
     *     
     */
    public void setSignatureObject(SignatureObject value) {
        this.signatureObject = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
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
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}DocumentWithSignature" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}VerificationReport" minOccurs="0"/&gt;
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
        "documentWithSignature",
        "verificationReport"
    })
    public static class OptionalOutputs {

        @XmlElement(name = "DocumentWithSignature")
        protected DocumentType documentWithSignature;
        @XmlElement(name = "VerificationReport", namespace = "urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#")
        protected VerificationReportType verificationReport;

        /**
         * Gets the value of the documentWithSignature property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentType }
         *     
         */
        public DocumentType getDocumentWithSignature() {
            return documentWithSignature;
        }

        /**
         * Sets the value of the documentWithSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentType }
         *     
         */
        public void setDocumentWithSignature(DocumentType value) {
            this.documentWithSignature = value;
        }

        /**
         * Gets the value of the verificationReport property.
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

    }

}
