package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder {

    /**
     * 
     * @param name name of ordinary client
     */
    public OrdinaryClient(String name) {
        super(name);
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
        throw new UnsupportedOperationException("Unimplemented method 'takeInQueue'");

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