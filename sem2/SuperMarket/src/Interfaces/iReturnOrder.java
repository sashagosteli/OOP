package Interfaces;

public interface iReturnOrder {
    /**
     * 
     * еще не прописаный интерфейс, сделала минимум как было в задании :
     * добавила и продумала и подсоединила к классам,
     * на большее пока к сожалению нет времени
     */
    void returnToTheMarket(iActorBehaviour actor);

    void returnOrder(iActorBehaviour actor);

    void setReturnOrder(boolean returnOrder);

    void becameMoneyBack(iActorBehaviour actor);

    void setMoneyBack(boolean getMoneyBack);

}
