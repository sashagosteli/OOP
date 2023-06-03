package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class SalesClient extends Actor implements iReturnOrder {
    /**
     * Не смогла реализовать count в countSalesClientsInOneSale()на вообще любую
     * акцию, сделала с конкретным номером(именем),
     * подскажите пожалуйста, как надо было бы сделать для любого номера акции в
     * этом
     * случае, через else все прописывать показалось неправильно, хотя если у нас
     * количество акций ограничено и мы знаем все их номера или имена - могло бы
     * подойти?
     * 
     */

    private static int idSalesClient;
    public static Integer numberOfSale;

    static Integer count;

    static {
        count = 1;
    }

    public SalesClient(String name, int numberOfSale, int idSalesClient) {
        super(name);
        SalesClient.numberOfSale = numberOfSale;
        SalesClient.idSalesClient = idSalesClient;
    }

    public static int countSalesClientsInOneSale() {
        int temp;
        SalesClient.getSalesClientId();
        if (numberOfSale == 22) {
            temp = count;

            System.out.println(
                    "Акционный клиент с id номер " + idSalesClient + " Участник на Акции номер " + numberOfSale
                            + ". Всего участников на этой акции --> " + temp);
            count++;
        } else {
            System.out.println(
                    "Акционный клиент с id номер " + idSalesClient + " - участник на акции номер --> "
                            + numberOfSale);
        }
        return count;
    }

    public static int getSalesClientId() {
        return idSalesClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public void returnToTheMarket(iActorBehaviour actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnToTheMarket'");
    }

    @Override
    public void returnOrder(iActorBehaviour actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReturnOrder'");
    }

    @Override
    public void becameMoneyBack(iActorBehaviour actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'becameMoneyBack'");
    }

    @Override
    public void setMoneyBack(boolean getMoneyBack) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMoneyBack'");
    }

}
