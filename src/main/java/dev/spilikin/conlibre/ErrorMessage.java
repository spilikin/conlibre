package dev.spilikin.conlibre;

import de.gematik.ws.tel.error.v2.Error;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ErrorMessage extends Error {
    private static DatatypeFactory datatypeFactory;

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public ErrorMessage(KonnektorError error) {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.setTimeZone(TimeZone.getDefault());

        this.setMessageID(""); // According to gemSpec_OM "bzw. leer"
        this.setTimestamp(datatypeFactory.newXMLGregorianCalendar(cal));

        Trace trace = new Trace();
        trace.setCode(BigInteger.valueOf(error.getCode()));
        trace.setSeverity(error.getSeverity().name());
        trace.setErrorType(error.getType().name());
        this.getTrace().add(trace);
    }
}
