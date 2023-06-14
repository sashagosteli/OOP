package View;

import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("-----Output - the list of students-----");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("-----End of the list-----");
    }

    public static void printAllStudentsEng(List<Student> students) {
        System.out.println("-----Output - the list of students-----");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("-----End of the list-----");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static void getAllStudents(List<Student> students) {
        printAllStudentsEng(students);

    }
}
