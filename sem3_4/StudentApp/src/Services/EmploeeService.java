package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.PersonComparator;

public class EmploeeService implements iPersonService {
    private int count;
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, String SecondName, int age) {

        Emploee emp = new Emploee(firstName, SecondName, age, "basic");

        emploees.add(emp);
    }

    public List<Emploee> getSortedByFIOEmploeeList() {
        List<Emploee> newEmploiList = new ArrayList<Emploee>(emploees);
        newEmploiList.sort(new PersonComparator<Emploee>());
        return newEmploiList;
    }
}
