package sem6.SRP;

import sem6.SRP.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * не разобралась с нужным импутом для типа данных Date, поэтому и зменила
         * временно на int
         * 
         * в итоге по принципу SRP теперь зарплата нетто выщитывается в отдельном
         * методе, для этого не нужно менять родительский класс Employee
         * 
         */
        Employee manager = new Employee("Ivan", 1970, 50000);
        System.out.println(manager.getEmpInfo());
        System.out.println(CalculateSalary.calculateNetSalary(manager));

        Employee cleaner = new Employee("Anna", 1989, 20000);
        System.out.println(cleaner.getEmpInfo());
        System.out.println(CalculateSalary.calculateNetSalary(cleaner));

    }
}
