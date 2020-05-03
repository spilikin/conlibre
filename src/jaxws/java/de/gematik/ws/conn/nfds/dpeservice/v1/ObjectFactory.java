
package de.gematik.ws.conn.nfds.dpeservice.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.nfds.dpeservice.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.nfds.dpeservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link ReadDPE }
     * 
     */
    public ReadDPE createReadDPE() {
        return new ReadDPE();
    }

    /**
     * Create an instance of {@link ReadDPEResponse }
     * 
     */
    public ReadDPEResponse createReadDPEResponse() {
        return new ReadDPEResponse();
    }

    /**
     * Create an instance of {@link WriteDPE }
     * 
     */
    public WriteDPE createWriteDPE() {
        return new WriteDPE();
    }

    /**
     * Create an instance of {@link WriteDPEResponse }
     * 
     */
    public WriteDPEResponse createWriteDPEResponse() {
        return new WriteDPEResponse();
    }

    /**
     * Create an instance of {@link EraseDPE }
     * 
     */
    public EraseDPE createEraseDPE() {
        return new EraseDPE();
    }

    /**
     * Create an instance of {@link EraseDPEResponse }
     * 
     */
    public EraseDPEResponse createEraseDPEResponse() {
        return new EraseDPEResponse();
    }

}
