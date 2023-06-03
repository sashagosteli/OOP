import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SalesClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

// 1) Добавить класс, описывающий акционного клиента. 
//Включить поле название акции, id клиента и количество участников в акции(поле статическое)
// 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
// 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.
public class App {
    public static void main(String[] args) throws Exception {
        /**
         * 
         */
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new SalesClient("Ecomonical", 22, 1);
        SalesClient.countSalesClientsInOneSale();
        iActorBehaviour client5 = new SalesClient("poorman", 5, 2);
        SalesClient.countSalesClientsInOneSale();
        iActorBehaviour client6 = new SalesClient("smartguy", 22, 3);
        SalesClient.countSalesClientsInOneSale();
        iActorBehaviour client7 = new SalesClient("Иван", 22, 4);
        SalesClient.countSalesClientsInOneSale();
        iActorBehaviour client8 = new SalesClient("Дима", 22, 5);
        SalesClient.countSalesClientsInOneSale();

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);

        market.acceptToMarket(client5);

        market.acceptToMarket(client6);
        market.acceptToMarket(client7);
        market.acceptToMarket(client8);

        market.acceptToMarket(new TaxService());

        market.update();

    }

}
