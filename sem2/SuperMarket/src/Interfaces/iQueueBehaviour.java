package Interfaces;

public interface iQueueBehaviour {
    /**
     * 
     * @param actor
     */
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();
}