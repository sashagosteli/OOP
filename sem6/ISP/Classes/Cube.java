package sem6.ISP.Classes;

import sem6.ISP.Services.iShapeArea;
import sem6.ISP.Services.iShapeVolume;

public class Cube implements iShapeArea, iShapeVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

}
