
package de.gematik.ws.conn.signatureservice.v7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import oasis.names.tc.dss._1_0.core.schema.UseVerificationTimeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.signatureservice.v7 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TvMode_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "TvMode");
    private final static QName _JobNumber_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "JobNumber");
    private final static QName _Document_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "Document");
    private final static QName _IncludeRevocationInfo_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "IncludeRevocationInfo");
    private final static QName _SignatureSchemes_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "SignatureSchemes");
    private final static QName _DocumentWithSignature_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "DocumentWithSignature");
    private final static QName _UseVerificationTime_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "UseVerificationTime");
    private final static QName _BinaryString_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "BinaryString");
    private final static QName _Deselected_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "Deselected");
    private final static QName _SignatureForm_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "SignatureForm");
    private final static QName _IncludeEContent_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "IncludeEContent");
    private final static QName _ShortText_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "ShortText");
    private final static QName _ReferenceToSignerCertificate_QNAME = new QName("http://ws.gematik.de/conn/SignatureService/v7.4", "ReferenceToSignerCertificate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.signatureservice.v7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignRequest }
     * 
     */
    public SignRequest createSignRequest() {
        return new SignRequest();
    }

    /**
     * Create an instance of {@link SignResponse }
     * 
     */
    public SignResponse createSignResponse() {
        return new SignResponse();
    }

    /**
     * Create an instance of {@link VerifyDocument }
     * 
     */
    public VerifyDocument createVerifyDocument() {
        return new VerifyDocument();
    }

    /**
     * Create an instance of {@link VerifyDocumentResponse }
     * 
     */
    public VerifyDocumentResponse createVerifyDocumentResponse() {
        return new VerifyDocumentResponse();
    }

    /**
     * Create an instance of {@link ExternalAuthenticate }
     * 
     */
    public ExternalAuthenticate createExternalAuthenticate() {
        return new ExternalAuthenticate();
    }

    /**
     * Create an instance of {@link ViewerInfo }
     * 
     */
    public ViewerInfo createViewerInfo() {
        return new ViewerInfo();
    }

    /**
     * Create an instance of {@link CounterSignatureMarker }
     * 
     */
    public CounterSignatureMarker createCounterSignatureMarker() {
        return new CounterSignatureMarker();
    }

    /**
     * Create an instance of {@link DisplayableAttributes }
     * 
     */
    public DisplayableAttributes createDisplayableAttributes() {
        return new DisplayableAttributes();
    }

    /**
     * Create an instance of {@link SignRequest.OptionalInputs }
     * 
     */
    public SignRequest.OptionalInputs createSignRequestOptionalInputs() {
        return new SignRequest.OptionalInputs();
    }

    /**
     * Create an instance of {@link SignDocument }
     * 
     */
    public SignDocument createSignDocument() {
        return new SignDocument();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link SignDocumentResponse }
     * 
     */
    public SignDocumentResponse createSignDocumentResponse() {
        return new SignDocumentResponse();
    }

    /**
     * Create an instance of {@link SignResponse.OptionalOutputs }
     * 
     */
    public SignResponse.OptionalOutputs createSignResponseOptionalOutputs() {
        return new SignResponse.OptionalOutputs();
    }

    /**
     * Create an instance of {@link VerifyDocument.OptionalInputs }
     * 
     */
    public VerifyDocument.OptionalInputs createVerifyDocumentOptionalInputs() {
        return new VerifyDocument.OptionalInputs();
    }

    /**
     * Create an instance of {@link VerificationResultType }
     * 
     */
    public VerificationResultType createVerificationResultType() {
        return new VerificationResultType();
    }

    /**
     * Create an instance of {@link VerifyDocumentResponse.OptionalOutputs }
     * 
     */
    public VerifyDocumentResponse.OptionalOutputs createVerifyDocumentResponseOptionalOutputs() {
        return new VerifyDocumentResponse.OptionalOutputs();
    }

    /**
     * Create an instance of {@link GetJobNumber }
     * 
     */
    public GetJobNumber createGetJobNumber() {
        return new GetJobNumber();
    }

    /**
     * Create an instance of {@link GetJobNumberResponse }
     * 
     */
    public GetJobNumberResponse createGetJobNumberResponse() {
        return new GetJobNumberResponse();
    }

    /**
     * Create an instance of {@link ExternalAuthenticate.OptionalInputs }
     * 
     */
    public ExternalAuthenticate.OptionalInputs createExternalAuthenticateOptionalInputs() {
        return new ExternalAuthenticate.OptionalInputs();
    }

    /**
     * Create an instance of {@link BinaryDocumentType }
     * 
     */
    public BinaryDocumentType createBinaryDocumentType() {
        return new BinaryDocumentType();
    }

    /**
     * Create an instance of {@link ExternalAuthenticateResponse }
     * 
     */
    public ExternalAuthenticateResponse createExternalAuthenticateResponse() {
        return new ExternalAuthenticateResponse();
    }

    /**
     * Create an instance of {@link StopSignature }
     * 
     */
    public StopSignature createStopSignature() {
        return new StopSignature();
    }

    /**
     * Create an instance of {@link StopSignatureResponse }
     * 
     */
    public StopSignatureResponse createStopSignatureResponse() {
        return new StopSignatureResponse();
    }

    /**
     * Create an instance of {@link ViewerInfo.XslStyleSheets }
     * 
     */
    public ViewerInfo.XslStyleSheets createViewerInfoXslStyleSheets() {
        return new ViewerInfo.XslStyleSheets();
    }

    /**
     * Create an instance of {@link CounterSignatureMarker.SignatureValueReference }
     * 
     */
    public CounterSignatureMarker.SignatureValueReference createCounterSignatureMarkerSignatureValueReference() {
        return new CounterSignatureMarker.SignatureValueReference();
    }

    /**
     * Create an instance of {@link DisplayableAttributes.DisplayableAttribute }
     * 
     */
    public DisplayableAttributes.DisplayableAttribute createDisplayableAttributesDisplayableAttribute() {
        return new DisplayableAttributes.DisplayableAttribute();
    }

    /**
     * Create an instance of {@link SignRequest.OptionalInputs.IncludeObjects }
     * 
     */
    public SignRequest.OptionalInputs.IncludeObjects createSignRequestOptionalInputsIncludeObjects() {
        return new SignRequest.OptionalInputs.IncludeObjects();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "TvMode", defaultValue = "UNCONFIRMED")
    public JAXBElement<String> createTvMode(String value) {
        return new JAXBElement<String>(_TvMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "JobNumber")
    public JAXBElement<String> createJobNumber(String value) {
        return new JAXBElement<String>(_JobNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "Document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "IncludeRevocationInfo")
    public JAXBElement<Boolean> createIncludeRevocationInfo(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeRevocationInfo_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "SignatureSchemes")
    public JAXBElement<String> createSignatureSchemes(String value) {
        return new JAXBElement<String>(_SignatureSchemes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "DocumentWithSignature")
    public JAXBElement<DocumentType> createDocumentWithSignature(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentWithSignature_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseVerificationTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UseVerificationTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "UseVerificationTime")
    public JAXBElement<UseVerificationTimeType> createUseVerificationTime(UseVerificationTimeType value) {
        return new JAXBElement<UseVerificationTimeType>(_UseVerificationTime_QNAME, UseVerificationTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BinaryDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "BinaryString")
    public JAXBElement<BinaryDocumentType> createBinaryString(BinaryDocumentType value) {
        return new JAXBElement<BinaryDocumentType>(_BinaryString_QNAME, BinaryDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "Deselected")
    public JAXBElement<Object> createDeselected(Object value) {
        return new JAXBElement<Object>(_Deselected_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "SignatureForm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSignatureForm(String value) {
        return new JAXBElement<String>(_SignatureForm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "IncludeEContent")
    public JAXBElement<Boolean> createIncludeEContent(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeEContent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "ShortText")
    public JAXBElement<String> createShortText(String value) {
        return new JAXBElement<String>(_ShortText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/SignatureService/v7.4", name = "ReferenceToSignerCertificate")
    public JAXBElement<Boolean> createReferenceToSignerCertificate(Boolean value) {
        return new JAXBElement<Boolean>(_ReferenceToSignerCertificate_QNAME, Boolean.class, null, value);
    }

}
