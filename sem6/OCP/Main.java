package sem6.OCP;

import sem6.OCP.Classes.Vehicle;
import sem6.OCP.Classes.Bus;
import sem6.OCP.Classes.Car;

/**
 * Open-Closed Principle
 * 
 */
class Main {
    public static void main(String[] args) {
        Car car = new Car(100, "Car");
        System.out.println(car.getAllowedSpeed());
        // System.out.println(car.getType());

        Bus bus = new Bus(100, "Bus");
        System.out.println(bus.getAllowedSpeed());
    }
}