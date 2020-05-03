
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import oasis.names.tc.dss._1_0.core.schema.UpdatedSignatureType;
import oasis.names.tc.dss._1_0.core.schema.VerifyManifestResultsType;
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
 *         &lt;element name="VerificationResult" type="{http://ws.gematik.de/conn/SignatureService/v7.4}VerificationResultType"/&gt;
 *         &lt;element name="OptionalOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyManifestResults" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}DocumentWithSignature" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}UpdatedSignature" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}VerificationReport" minOccurs="0"/&gt;
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
    "status",
    "verificationResult",
    "optionalOutputs"
})
@XmlRootElement(name = "VerifyDocumentResponse")
public class VerifyDocumentResponse {

    @XmlElement(name = "Status", namespace = "http://ws.gematik.de/conn/ConnectorCommon/v5.0", required = true)
    protected Status status;
    @XmlElement(name = "VerificationResult", required = true)
    protected VerificationResultType verificationResult;
    @XmlElement(name = "OptionalOutputs")
    protected VerifyDocumentResponse.OptionalOutputs optionalOutputs;

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

    /**
     * Gets the value of the optionalOutputs property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyDocumentResponse.OptionalOutputs }
     *     
     */
    public VerifyDocumentResponse.OptionalOutputs getOptionalOutputs() {
        return optionalOutputs;
    }

    /**
     * Sets the value of the optionalOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyDocumentResponse.OptionalOutputs }
     *     
     */
    public void setOptionalOutputs(VerifyDocumentResponse.OptionalOutputs value) {
        this.optionalOutputs = value;
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
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyManifestResults" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}DocumentWithSignature" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}UpdatedSignature" minOccurs="0"/&gt;
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
        "verifyManifestResults",
        "documentWithSignature",
        "updatedSignature",
        "verificationReport"
    })
    public static class OptionalOutputs {

        @XmlElement(name = "VerifyManifestResults", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected VerifyManifestResultsType verifyManifestResults;
        @XmlElement(name = "DocumentWithSignature")
        protected DocumentType documentWithSignature;
        @XmlElement(name = "UpdatedSignature", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected UpdatedSignatureType updatedSignature;
        @XmlElement(name = "VerificationReport", namespace = "urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#")
        protected VerificationReportType verificationReport;

        /**
         * Gets the value of the verifyManifestResults property.
         * 
         * @return
         *     possible object is
         *     {@link VerifyManifestResultsType }
         *     
         */
        public VerifyManifestResultsType getVerifyManifestResults() {
            return verifyManifestResults;
        }

        /**
         * Sets the value of the verifyManifestResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link VerifyManifestResultsType }
         *     
         */
        public void setVerifyManifestResults(VerifyManifestResultsType value) {
            this.verifyManifestResults = value;
        }

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
         * Gets the value of the updatedSignature property.
         * 
         * @return
         *     possible object is
         *     {@link UpdatedSignatureType }
         *     
         */
        public UpdatedSignatureType getUpdatedSignature() {
            return updatedSignature;
        }

        /**
         * Sets the value of the updatedSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdatedSignatureType }
         *     
         */
        public void setUpdatedSignature(UpdatedSignatureType value) {
            this.updatedSignature = value;
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
