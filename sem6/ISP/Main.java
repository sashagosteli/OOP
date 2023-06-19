package sem6.ISP;

import sem6.ISP.Classes.Circle;
import sem6.ISP.Classes.Cube;

/**
 * v hw 6
 * 
 * ISP - Interface Segregation Principle
 */
public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(6);
        System.out.println(cube.volume());
        System.out.println(cube.area());

        Circle circle = new Circle(6);
        System.out.println(circle.area());
    }
}
