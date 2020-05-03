package dev.spilikin.conlibre.eventservice;

import de.gematik.ws.conn.cardservice.v8.CardInfoType;
import de.gematik.ws.conn.cardservice.v8.Cards;
import de.gematik.ws.conn.cardservicecommon.v2.CardTypeType;
import de.gematik.ws.conn.eventservice.v7.*;
import de.gematik.ws.conn.eventservice.wsdl.v7_2.EventServicePortType;
import de.gematik.ws.conn.eventservice.wsdl.v7_2.FaultMessage;
import dev.spilikin.conlibre.ErrorMessage;
import dev.spilikin.conlibre.KonnektorError;
import dev.spilikin.conlibre.Version;
import dev.spilikin.conlibre.softcard.Softcard;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.Map;

@Version("7.2.0")
@WebService(
        targetNamespace = "http://ws.gematik.de/conn/EventService/WSDL/v7.2",
        name = "EventService"
)
public class EventService implements EventServicePortType {
    @Resource
    private Map<String, Softcard> cards;

    @Override
    public SubscribeResponse subscribe(Subscribe subscribe) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public GetResourceInformationResponse getResourceInformation(GetResourceInformation getResourceInformation) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public GetSubscriptionResponse getSubscription(GetSubscription getSubscription) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public UnsubscribeResponse unsubscribe(Unsubscribe unsubscribe) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public GetCardTerminalsResponse getCardTerminals(GetCardTerminals getCardTerminals) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public RenewSubscriptionsResponse renewSubscriptions(RenewSubscriptions renewSubscriptions) throws FaultMessage {
        throw new FaultMessage("Not implemented", new ErrorMessage(KonnektorError.E4000));
    }

    @Override
    public GetCardsResponse getCards(GetCards getCards) {
        GetCardsResponse response = new GetCardsResponse();
        Cards cardsValue = new Cards();
        response.setCards(cardsValue);

        for (Softcard card : this.cards.values()) {
            CardInfoType cardInfo = new CardInfoType();
            cardInfo.setCardHandle(card.getName());
            cardInfo.setCardType(CardTypeType.SMC_B);
            cardsValue.getCard().add(cardInfo);
        }


        return response;
    }
}
