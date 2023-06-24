package sem7.HWsem7;

public class CalcComplexDecorator implements iCalculable {
    private iCalculable oldCalc;
    private Logger logger;

    public CalcComplexDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

    @Override
    public String getResult() {
        String result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    /**
     * нужно чтобы отображались логи с чем-то вроде:
     * "Первое значение комплексного числа в калькуляторе... начало вызова метода
     * ... "
     * "Вызов метода ... произошел"
     */
    @Override
    public iCalculable multiComplex(int a, int b, int c, int d) {

        logger.log(String
                .format(" Значения комплексных чисел в калькуляторе: (" + a + "+" + b + "i)" + "(" + c + "+" + d + "i)"
                        + " Начало вызова метода multiComplex "));
        logger.log(String.format("Вызов метода multiComplex произошел"));
        iCalculable result = oldCalc.multiComplex(a, b, c, d);

        return result;

    }

    @Override
    public iCalculable sumComplex(int a, int b, int c, int d) {
        logger.log(String
                .format(" Значения комплексных чисел в калькуляторе: (" + a + "+" + b + "i)" + "(" + c + "+" + d + "i)"
                        + " Начало вызова метода sumComplex "));
        logger.log(String.format("Вызов метода sumComplex произошел"));

        iCalculable result = oldCalc.sumComplex(a, b, c, d);
        return result;
    }

    @Override
    public iCalculable divideComplex(int a, int b, int c, int d) {
        logger.log(String
                .format(" Значения комплексных чисел в калькуляторе: (" + a + "+" + b + "i)" + "(" + c + "+" + d + "i)"
                        + " Начало вызова метода divideComplex "));
        logger.log(String.format("Вызов метода divideComplex произошел"));
        iCalculable result = oldCalc.divideComplex(a, b, c, d);

        return result;
    }

}