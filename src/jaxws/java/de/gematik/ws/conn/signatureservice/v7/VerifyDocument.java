
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws.conn.connectorcontext.v2.ContextType;
import oasis.names.tc.dss._1_0.core.schema.AdditionalKeyInfo;
import oasis.names.tc.dss._1_0.core.schema.SchemasType;
import oasis.names.tc.dss._1_0.core.schema.SignatureObject;
import oasis.names.tc.dss._1_0.core.schema.UseVerificationTimeType;
import oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_.ReturnVerificationReport;


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
 *         &lt;element ref="{http://ws.gematik.de/conn/ConnectorContext/v2.0}Context"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}TvMode" minOccurs="0"/&gt;
 *         &lt;element name="OptionalInputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="VerifyManifests" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}UseVerificationTime" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AdditionalKeyInfo" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}ReturnVerificationReport" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Schemas" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}ViewerInfo" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}Document" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureObject" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}IncludeRevocationInfo"/&gt;
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
    "context",
    "tvMode",
    "optionalInputs",
    "document",
    "signatureObject",
    "includeRevocationInfo"
})
@XmlRootElement(name = "VerifyDocument")
public class VerifyDocument {

    @XmlElement(name = "Context", namespace = "http://ws.gematik.de/conn/ConnectorContext/v2.0", required = true)
    protected ContextType context;
    @XmlElement(name = "TvMode", defaultValue = "UNCONFIRMED")
    protected String tvMode;
    @XmlElement(name = "OptionalInputs")
    protected VerifyDocument.OptionalInputs optionalInputs;
    @XmlElement(name = "Document")
    protected DocumentType document;
    @XmlElement(name = "SignatureObject", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected SignatureObject signatureObject;
    @XmlElement(name = "IncludeRevocationInfo")
    protected boolean includeRevocationInfo;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

    /**
     * Gets the value of the tvMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTvMode() {
        return tvMode;
    }

    /**
     * Sets the value of the tvMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTvMode(String value) {
        this.tvMode = value;
    }

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyDocument.OptionalInputs }
     *     
     */
    public VerifyDocument.OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyDocument.OptionalInputs }
     *     
     */
    public void setOptionalInputs(VerifyDocument.OptionalInputs value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
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
     * Gets the value of the includeRevocationInfo property.
     * 
     */
    public boolean isIncludeRevocationInfo() {
        return includeRevocationInfo;
    }

    /**
     * Sets the value of the includeRevocationInfo property.
     * 
     */
    public void setIncludeRevocationInfo(boolean value) {
        this.includeRevocationInfo = value;
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
     *       &lt;all&gt;
     *         &lt;element name="VerifyManifests" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}UseVerificationTime" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AdditionalKeyInfo" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}ReturnVerificationReport" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Schemas" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}ViewerInfo" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class OptionalInputs {

        @XmlElement(name = "VerifyManifests")
        protected Object verifyManifests;
        @XmlElement(name = "UseVerificationTime")
        protected UseVerificationTimeType useVerificationTime;
        @XmlElement(name = "AdditionalKeyInfo", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected AdditionalKeyInfo additionalKeyInfo;
        @XmlElement(name = "ReturnVerificationReport", namespace = "urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#")
        protected ReturnVerificationReport returnVerificationReport;
        @XmlElement(name = "Schemas", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected SchemasType schemas;
        @XmlElement(name = "ViewerInfo")
        protected ViewerInfo viewerInfo;

        /**
         * Gets the value of the verifyManifests property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVerifyManifests() {
            return verifyManifests;
        }

        /**
         * Sets the value of the verifyManifests property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVerifyManifests(Object value) {
            this.verifyManifests = value;
        }

        /**
         * Gets the value of the useVerificationTime property.
         * 
         * @return
         *     possible object is
         *     {@link UseVerificationTimeType }
         *     
         */
        public UseVerificationTimeType getUseVerificationTime() {
            return useVerificationTime;
        }

        /**
         * Sets the value of the useVerificationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseVerificationTimeType }
         *     
         */
        public void setUseVerificationTime(UseVerificationTimeType value) {
            this.useVerificationTime = value;
        }

        /**
         * Gets the value of the additionalKeyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalKeyInfo }
         *     
         */
        public AdditionalKeyInfo getAdditionalKeyInfo() {
            return additionalKeyInfo;
        }

        /**
         * Sets the value of the additionalKeyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalKeyInfo }
         *     
         */
        public void setAdditionalKeyInfo(AdditionalKeyInfo value) {
            this.additionalKeyInfo = value;
        }

        /**
         * Gets the value of the returnVerificationReport property.
         * 
         * @return
         *     possible object is
         *     {@link ReturnVerificationReport }
         *     
         */
        public ReturnVerificationReport getReturnVerificationReport() {
            return returnVerificationReport;
        }

        /**
         * Sets the value of the returnVerificationReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReturnVerificationReport }
         *     
         */
        public void setReturnVerificationReport(ReturnVerificationReport value) {
            this.returnVerificationReport = value;
        }

        /**
         * Gets the value of the schemas property.
         * 
         * @return
         *     possible object is
         *     {@link SchemasType }
         *     
         */
        public SchemasType getSchemas() {
            return schemas;
        }

        /**
         * Sets the value of the schemas property.
         * 
         * @param value
         *     allowed object is
         *     {@link SchemasType }
         *     
         */
        public void setSchemas(SchemasType value) {
            this.schemas = value;
        }

        /**
         * Gets the value of the viewerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ViewerInfo }
         *     
         */
        public ViewerInfo getViewerInfo() {
            return viewerInfo;
        }

        /**
         * Sets the value of the viewerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ViewerInfo }
         *     
         */
        public void setViewerInfo(ViewerInfo value) {
            this.viewerInfo = value;
        }

    }

}
