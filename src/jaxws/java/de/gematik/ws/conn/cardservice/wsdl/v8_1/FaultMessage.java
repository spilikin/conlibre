
package de.gematik.ws.conn.cardservice.wsdl.v8_1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-02T19:08:09.992+02:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "Error", targetNamespace = "http://ws.gematik.de/tel/error/v2.0")
public class FaultMessage extends Exception {

    private de.gematik.ws.tel.error.v2.Error error;

    public FaultMessage() {
        super();
    }

    public FaultMessage(String message) {
        super(message);
    }

    public FaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, de.gematik.ws.tel.error.v2.Error error) {
        super(message);
        this.error = error;
    }

    public FaultMessage(String message, de.gematik.ws.tel.error.v2.Error error, java.lang.Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public de.gematik.ws.tel.error.v2.Error getFaultInfo() {
        return this.error;
    }
}
