package emu.konauth.cardservice;

import emu.konauth.ErrorMessage;
import emu.konauth.KonnektorError;
import emu.konauth.Version;
import telematik.ws.conn.cardservice.v8_1.*;
import telematik.ws.conn.cardservice.wsdl.v8_1_1.CardServicePortType;
import telematik.ws.conn.cardservice.wsdl.v8_1_1.FaultMessage;
import telematik.ws.conn.cardservicecommon.v2_0.PinResponseType;

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
