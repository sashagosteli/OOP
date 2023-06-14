package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();

    public static void deleteStudent(List<Student> students, int n) {
        students.remove(n);
        System.out.println(students);
    }

}
