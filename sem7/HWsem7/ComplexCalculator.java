package sem7.HWsem7;

public class ComplexCalculator implements iCalculable {

    private double a;
    private double b;
    private double primaryArg = a + b;
    private double c;
    private double d;
    private double secondArg = c + d;
    double result;

    public ComplexCalculator(double primaryArg, double secondArg) {
        this.primaryArg = primaryArg;
        this.secondArg = secondArg;
    }

    @Override
    public iCalculable multiComplex(int a, int b, int c, int d) {
        primaryArg = (a * c - b * d);
        secondArg = (b * c + a * d);
        System.out.println("Результат " + Math.round(primaryArg) + " + " + Math.round(secondArg) + "i");
        return this;
    }

    @Override
    public iCalculable sumComplex(int a, int b, int c, int d) {
        primaryArg = (a + c);
        secondArg = (b + d);
        System.out.println("Результат " + Math.round(primaryArg) + " + " + Math.round(secondArg) + "i");
        return this;
    }

    @Override
    public String getResult() {
        return primaryArg + "+" + secondArg;
    }

    @Override
    public iCalculable divideComplex(int a, int b, int c, int d) {
        primaryArg = (a * c + b * d) / (Math.pow(c, 2) + Math.pow(d, 2));
        secondArg = (b * c - a * d) / (Math.pow(c, 2) + Math.pow(d, 2));
        System.out.println("Результат " + primaryArg + " + " + secondArg + "i");
        return this;

    }

}
