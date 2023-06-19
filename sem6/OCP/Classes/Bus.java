package sem6.OCP.Classes;

/**
 * Separated for classes any type if vehicle, vehicle as parent
 */
public class Bus extends Vehicle {
    String typeBus = "Bus";

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        this.typeBus = type;

    }

    public String getAllowedSpeed() {
        double busAllowedSpeed = super.getMaxSpeed() * 0.6;
        return "Разрешенная скорость автобуса: " + busAllowedSpeed;
    }

    @Override
    public String getType() {
        return type;
    }
}
