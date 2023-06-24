package sem7.HWsem7;

import java.util.Scanner;

public class ViewComplexCalculator {
    private iCalculable calculator;

    public ViewComplexCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArgA = promptInt("Введите первый аргумент (a) комплексного числа (a + bi): ");
            int primaryArgB = promptInt("Введите второй аргумент (b) комплексного числа (a + bi): ");

            // iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*,/, +, =) : ");
                if (cmd.equals("*")) {
                    int primaryArgC = promptInt("Введите первый аргумент (c) комплексного числа (c + di): ");
                    int primaryArgD = promptInt("Введите второй аргумент (d) комплексного числа (c + di): ");
                    System.out.println(calculator.multiComplex(primaryArgA, primaryArgB, primaryArgC, primaryArgD));
                    break;
                }
                if (cmd.equals("+")) {
                    int primaryArgC = promptInt("Введите первый аргумент (c) комплексного числа (c + di): ");
                    int primaryArgD = promptInt("Введите второй аргумент (d) комплексного числа (c + di): ");
                    System.out.println(calculator.sumComplex(primaryArgA, primaryArgB, primaryArgC, primaryArgD));
                    break;
                }
                if (cmd.equals("/")) {
                    int primaryArgC = promptInt("Введите первый аргумент (c) комплексного числа (c + di): ");
                    int primaryArgD = promptInt("Введите второй аргумент (d) комплексного числа (c + di): ");
                    System.out.println(calculator.divideComplex(primaryArgA, primaryArgB, primaryArgC, primaryArgD));
                    break;
                }

            }
            String cmd = prompt("Еще посчитать (Y/N)?");

            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
