package Controllers;

import Services.EmploeeService;
import StudentDomen.Emploee;
import StudentDomen.Person;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empServ = new EmploeeService();

    @Override
    public void create(String firstName, String SecondName, int age) {
        empServ.create(firstName, SecondName, age);

    }

    static public <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " - Выплачена зарплата 10.000 рублей");
    }

}
