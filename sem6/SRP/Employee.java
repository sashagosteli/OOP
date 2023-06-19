package sem6.SRP;

import java.sql.Date;

public class Employee {
    private String name;
    private int dob;
    protected int baseSalary;

    public Employee(String name, int dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob;
    }

    public String getName() {
        return name;
    }

    public int getDob() {
        return dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}