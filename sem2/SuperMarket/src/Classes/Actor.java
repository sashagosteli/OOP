package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * the abstract class for concrete clients
     * 
     * @param name Actors name
     * 
     */
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

}