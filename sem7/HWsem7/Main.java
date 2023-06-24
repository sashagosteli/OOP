package sem7.HWsem7;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        // iCalculable calculator = new Calculator(0);
        iCalculable calculator = new CalcComplexDecorator(new ComplexCalculator(0 + 0, 0 + 0),
                new Logger());
        ViewComplexCalculator view = new ViewComplexCalculator(calculator);
        view.run();

    }
}
