package sem6.SRP;

public class CalculateSalary extends Employee {
    public CalculateSalary(String name, int dob, int baseSalary) {
        super(name, dob, baseSalary);

    }

    public static String calculateNetSalary(Employee emp) {
        int bs = emp.getBaseSalary();
        int tax = (int) (bs * 0.25);// calculate in otherway
        int netSalary = (bs - tax);
        return netSalary + " = NetSalary of " + emp.getName();

    }

}
