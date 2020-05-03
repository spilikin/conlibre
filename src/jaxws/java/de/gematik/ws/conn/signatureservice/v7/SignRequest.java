
package de.gematik.ws.conn.signatureservice.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.IncludeObject;
import oasis.names.tc.dss._1_0.core.schema.Properties;
import oasis.names.tc.dss._1_0.core.schema.ReturnUpdatedSignature;
import oasis.names.tc.dss._1_0.core.schema.SchemasType;
import oasis.names.tc.dss._1_0.core.schema.SignaturePlacement;
import oasis.names.tc.dss_x._1_0.profiles.signaturepolicy.schema_.SignaturePolicyDetailsType;


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
 *         &lt;element name="OptionalInputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureType" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Properties" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}IncludeEContent" minOccurs="0"/&gt;
 *                   &lt;element name="IncludeObjects" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IncludeObject" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignaturePlacement" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnUpdatedSignature" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Schemas" minOccurs="0"/&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}GenerateUnderSignaturePolicy" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}ViewerInfo" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}Document"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}IncludeRevocationInfo"/&gt;
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
    "optionalInputs",
    "document",
    "includeRevocationInfo"
})
@XmlRootElement(name = "SignRequest")
public class SignRequest {

    @XmlElement(name = "OptionalInputs")
    protected SignRequest.OptionalInputs optionalInputs;
    @XmlElement(name = "Document", required = true)
    protected DocumentType document;
    @XmlElement(name = "IncludeRevocationInfo")
    protected boolean includeRevocationInfo;
    @XmlAttribute(name = "RequestID", required = true)
    protected String requestID;

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link SignRequest.OptionalInputs }
     *     
     */
    public SignRequest.OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignRequest.OptionalInputs }
     *     
     */
    public void setOptionalInputs(SignRequest.OptionalInputs value) {
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
     *       &lt;all&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureType" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Properties" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ws.gematik.de/conn/SignatureService/v7.4}IncludeEContent" minOccurs="0"/&gt;
     *         &lt;element name="IncludeObjects" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IncludeObject" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignaturePlacement" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnUpdatedSignature" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Schemas" minOccurs="0"/&gt;
     *         &lt;element ref="{urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#}GenerateUnderSignaturePolicy" minOccurs="0"/&gt;
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

        @XmlElement(name = "SignatureType", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        @XmlSchemaType(name = "anyURI")
        protected String signatureType;
        @XmlElement(name = "Properties", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected Properties properties;
        @XmlElement(name = "IncludeEContent")
        protected Boolean includeEContent;
        @XmlElement(name = "IncludeObjects")
        protected SignRequest.OptionalInputs.IncludeObjects includeObjects;
        @XmlElement(name = "SignaturePlacement", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected SignaturePlacement signaturePlacement;
        @XmlElement(name = "ReturnUpdatedSignature", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected ReturnUpdatedSignature returnUpdatedSignature;
        @XmlElement(name = "Schemas", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
        protected SchemasType schemas;
        @XmlElement(name = "GenerateUnderSignaturePolicy", namespace = "urn:oasis:names:tc:dss-x:1.0:profiles:SignaturePolicy:schema#")
        protected SignaturePolicyDetailsType generateUnderSignaturePolicy;
        @XmlElement(name = "ViewerInfo")
        protected ViewerInfo viewerInfo;

        /**
         * Gets the value of the signatureType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureType() {
            return signatureType;
        }

        /**
         * Sets the value of the signatureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureType(String value) {
            this.signatureType = value;
        }

        /**
         * Gets the value of the properties property.
         * 
         * @return
         *     possible object is
         *     {@link Properties }
         *     
         */
        public Properties getProperties() {
            return properties;
        }

        /**
         * Sets the value of the properties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Properties }
         *     
         */
        public void setProperties(Properties value) {
            this.properties = value;
        }

        /**
         * Gets the value of the includeEContent property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeEContent() {
            return includeEContent;
        }

        /**
         * Sets the value of the includeEContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeEContent(Boolean value) {
            this.includeEContent = value;
        }

        /**
         * Gets the value of the includeObjects property.
         * 
         * @return
         *     possible object is
         *     {@link SignRequest.OptionalInputs.IncludeObjects }
         *     
         */
        public SignRequest.OptionalInputs.IncludeObjects getIncludeObjects() {
            return includeObjects;
        }

        /**
         * Sets the value of the includeObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link SignRequest.OptionalInputs.IncludeObjects }
         *     
         */
        public void setIncludeObjects(SignRequest.OptionalInputs.IncludeObjects value) {
            this.includeObjects = value;
        }

        /**
         * Gets the value of the signaturePlacement property.
         * 
         * @return
         *     possible object is
         *     {@link SignaturePlacement }
         *     
         */
        public SignaturePlacement getSignaturePlacement() {
            return signaturePlacement;
        }

        /**
         * Sets the value of the signaturePlacement property.
         * 
         * @param value
         *     allowed object is
         *     {@link SignaturePlacement }
         *     
         */
        public void setSignaturePlacement(SignaturePlacement value) {
            this.signaturePlacement = value;
        }

        /**
         * Gets the value of the returnUpdatedSignature property.
         * 
         * @return
         *     possible object is
         *     {@link ReturnUpdatedSignature }
         *     
         */
        public ReturnUpdatedSignature getReturnUpdatedSignature() {
            return returnUpdatedSignature;
        }

        /**
         * Sets the value of the returnUpdatedSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReturnUpdatedSignature }
         *     
         */
        public void setReturnUpdatedSignature(ReturnUpdatedSignature value) {
            this.returnUpdatedSignature = value;
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
         * Gets the value of the generateUnderSignaturePolicy property.
         * 
         * @return
         *     possible object is
         *     {@link SignaturePolicyDetailsType }
         *     
         */
        public SignaturePolicyDetailsType getGenerateUnderSignaturePolicy() {
            return generateUnderSignaturePolicy;
        }

        /**
         * Sets the value of the generateUnderSignaturePolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link SignaturePolicyDetailsType }
         *     
         */
        public void setGenerateUnderSignaturePolicy(SignaturePolicyDetailsType value) {
            this.generateUnderSignaturePolicy = value;
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
         *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IncludeObject" maxOccurs="unbounded"/&gt;
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
            "includeObject"
        })
        public static class IncludeObjects {

            @XmlElement(name = "IncludeObject", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", required = true)
            protected List<IncludeObject> includeObject;

            /**
             * Gets the value of the includeObject property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the includeObject property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncludeObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IncludeObject }
             * 
             * 
             */
            public List<IncludeObject> getIncludeObject() {
                if (includeObject == null) {
                    includeObject = new ArrayList<IncludeObject>();
                }
                return this.includeObject;
            }

        }

    }

}
