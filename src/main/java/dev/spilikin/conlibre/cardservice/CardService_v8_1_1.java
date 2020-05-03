package dev.spilikin.conlibre.cardservice;

import de.gematik.ws.conn.cardservice.v8.*;
import de.gematik.ws.conn.cardservice.wsdl.v8_1.CardServicePortType;
import de.gematik.ws.conn.cardservice.wsdl.v8_1.FaultMessage;
import de.gematik.ws.conn.cardservicecommon.v2.PinResponseType;
import dev.spilikin.conlibre.ErrorMessage;
import dev.spilikin.conlibre.KonnektorError;
import dev.spilikin.conlibre.Version;

import javax.annotation.Resource;
import javax.jws.WebService;

@WebService(
        targetNamespace = "http://ws.gematik.de/conn/CardService/WSDL/v8.1",
        name = "CardService"
)
@Version("8.1.1")
public class CardService_v8_1_1 implements CardServicePortType {
    @Resource
    private CardService_v8_1_2 cardService_v8_1_2;

    @Override
    public PinResponseType changePin(ChangePin changePin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType enablePin(EnablePin parameter) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType disablePin(DisablePin parameter) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType verifyPin(VerifyPin verifyPin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public PinResponseType unblockPin(UnblockPin unblockPin) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public GetPinStatusResponse getPinStatus(GetPinStatus getPinStatus) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }
}
