package sem6.OCP.Classes;

/**
 * Separated for classes any type if vehicle, vehicle as parent
 */
public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);

    }

    public String getAllowedSpeed() {
        double carAllowedSpeed = super.getMaxSpeed() * 0.8;
        return "Разрешенная скорость машины: " + carAllowedSpeed;
    }

    @Override
    public String getType() {
        return super.getType();
    }

}
