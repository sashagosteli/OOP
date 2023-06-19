package sem6.ISP.Classes;

import sem6.ISP.Services.iShapeArea;

public class Circle implements iShapeArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}
