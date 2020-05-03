package dev.spilikin.conlibre.cardservice;

import de.gematik.ws.conn.cardservice.v8.*;
import de.gematik.ws.conn.cardservice.wsdl.v8_1.CardServicePortType;
import de.gematik.ws.conn.cardservice.wsdl.v8_1.FaultMessage;
import de.gematik.ws.conn.cardservicecommon.v2.PinResponseType;
import de.gematik.ws.conn.cardservicecommon.v2.PinResultEnum;
import de.gematik.ws.conn.connectorcommon.v5.Status;
import dev.spilikin.conlibre.ErrorMessage;
import dev.spilikin.conlibre.KonnektorError;
import dev.spilikin.conlibre.Version;
import dev.spilikin.conlibre.authsignatureservice.AuthSignatureService;
import dev.spilikin.conlibre.softcard.Softcard;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.math.BigInteger;
import java.util.Map;

@WebService(
        targetNamespace = "http://ws.gematik.de/conn/CardService/WSDL/v8.1",
        name = "CardService"
)
@Version("8.1.2")
public class CardService_v8_1_2 implements CardServicePortType {
    @Resource
    private Map<String, Softcard> cards;
    @Autowired
    private AuthSignatureService authSignatureService;

    @Override
    public PinResponseType verifyPin(VerifyPin verifyPin) throws FaultMessage {


        Softcard card = cards.get(verifyPin.getCardHandle());

        if (card == null) {
            throw createTelematikError(KonnektorError.E4000, String.format("Unknown card handle '%s'", verifyPin.getCardHandle()));
        }

        PinType pinType;

        if (PinType.PIN_CH.getIdentifier().equals(verifyPin.getPinTyp())) {
            pinType = PinType.PIN_CH;
        } else if (PinType.PIN_SMC.getIdentifier().equals(verifyPin.getPinTyp())) {
            pinType = PinType.PIN_SMC;
        } else {
            throw createTelematikError(KonnektorError.E4000, String.format("Unknown pin type '%s'", verifyPin.getPinTyp()));
        }

        // TODO: make the PIN state more real
        authSignatureService.addPinVerifiedCardHandle(card.getName());

        // TODO: implement some variants
        ObjectFactory objectFactory = new ObjectFactory();
        PinResponseType response = new PinResponseType();
        response.setStatus(new Status());
        response.setPinResult(PinResultEnum.OK);
        response.setLeftTries(BigInteger.valueOf(3));

        return response;
    }

    @Override
    public GetPinStatusResponse getPinStatus(GetPinStatus getPinStatus) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType changePin(ChangePin changePin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType enablePin(EnablePin enablePin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType disablePin(DisablePin disablePin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType unblockPin(UnblockPin unblockPin) {
        return null;
    }

    private FaultMessage createTelematikError(KonnektorError error, String message) {
        return new FaultMessage(message, new ErrorMessage(error));
    }

}
