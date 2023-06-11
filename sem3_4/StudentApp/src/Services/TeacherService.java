package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iPersonService {
    private int count;
    private List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String SecondName, int age) {
        Teacher teach = new Teacher(firstName, SecondName, age, "MBA");
        teachers.add(teach);
    }

    public List<Teacher> getSortedByFIOTeacherList() {
        List<Teacher> newTeacherList = new ArrayList<Teacher>(teachers);
        newTeacherList.sort(new PersonComparator<Teacher>());
        return newTeacherList;
    }
}
