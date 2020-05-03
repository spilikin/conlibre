
package de.gematik.ws.conn.cardterminalservice.v1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.cardterminalservice.v1 package. 
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

    private final static QName _DisplayMsg_QNAME = new QName("http://ws.gematik.de/conn/CardTerminalService/v1.1", "DisplayMsg");
    private final static QName _TimeOut_QNAME = new QName("http://ws.gematik.de/conn/CardTerminalService/v1.1", "TimeOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.cardterminalservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestCard }
     * 
     */
    public RequestCard createRequestCard() {
        return new RequestCard();
    }

    /**
     * Create an instance of {@link Slot }
     * 
     */
    public Slot createSlot() {
        return new Slot();
    }

    /**
     * Create an instance of {@link RequestCardResponse }
     * 
     */
    public RequestCardResponse createRequestCardResponse() {
        return new RequestCardResponse();
    }

    /**
     * Create an instance of {@link EjectCard }
     * 
     */
    public EjectCard createEjectCard() {
        return new EjectCard();
    }

    /**
     * Create an instance of {@link EjectCardResponse }
     * 
     */
    public EjectCardResponse createEjectCardResponse() {
        return new EjectCardResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardTerminalService/v1.1", name = "DisplayMsg")
    public JAXBElement<String> createDisplayMsg(String value) {
        return new JAXBElement<String>(_DisplayMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gematik.de/conn/CardTerminalService/v1.1", name = "TimeOut")
    public JAXBElement<BigInteger> createTimeOut(BigInteger value) {
        return new JAXBElement<BigInteger>(_TimeOut_QNAME, BigInteger.class, null, value);
    }

}
