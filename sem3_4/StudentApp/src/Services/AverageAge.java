package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Person;

public class AverageAge<T extends Person> implements iPersonService<T> {

    private List<T> persons;

    // public AverageAge() {
    // this.persons = persons;

    // }

    public static <T> void getAverageAge(List<T> persons) {
        ArrayList<Integer> averAge = new ArrayList<>();
        {
            int sum = 0;
            for (T t : persons) {
                averAge.add(StudentDomen.Person.getAge());

            }
            for (Integer integer : averAge) {
                sum = sum + integer;
            }
            double averAgeFinal = sum / averAge.size();
            System.out.println(averAgeFinal);
        }
    }

    @Override
    public List getAll() {

        return persons;
    }

    @Override
    public void create(String firstName, String SecondName, int age) {
        final Person pers = new Person(firstName, SecondName, age);
    }

}
