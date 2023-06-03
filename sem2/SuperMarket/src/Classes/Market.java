package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;
    List<Actor> releaseActors = new ArrayList<>();
    List<Actor> unhappyActors = new ArrayList<>();

    /**
     * list of actors behaviour in market
     * methods
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();

    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            // queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();

    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        // List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    /**
     * 
     * "unhappy clients" boolean must be done
     * for returning only them back to Supermarket
     */
    @Override
    public void returnToTheMarket(iActorBehaviour actor) {

        for (iActorBehaviour unhappy : releaseActors) {
            unhappyActors.add(actor.getActor());
            System.out.println(actor.getActor().getName() + " клиент вернулся в магазин ");
        }
    }

    @Override
    public void returnOrder(iActorBehaviour actor) {
    }

    @Override
    public void becameMoneyBack(iActorBehaviour actor) {
        // if () {
        // actor.setTakeOrder(true);
        // System.out.println(actor.getActor().getName() + " клиент получил свой заказ
        // ");
        // }
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReturnOrder'");
    }

    @Override
    public void setMoneyBack(boolean getMoneyBack) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMoneyBack'");
    }

}