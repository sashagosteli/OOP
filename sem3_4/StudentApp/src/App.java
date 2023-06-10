import StudentDomen.StudentStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Person;
import StudentDomen.PersonComparator;
import StudentDomen.Student;
import StudentDomen.StudentGroup;

import StudentDomen.StudentStream;
import StudentDomen.Teacher;

/**
 * 1) Создать класс StudentSteam(поток студентов с полем номер потока)
 * содержащий в себе список учебных групп(StudentGroup).
 * 2) Для класса StudentSteam реализовать интерфейс Iterable
 * и вывести через for несколько групп со списком студентов на кансоль
 * 3) Для класса StudentGroup реализовать интерфейс Comparable
 * (сортировка по количеству студентов в группе) и отсортировать
 * группы студентов в потоке, а затем вывести в консоль
 */
public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Домашнее задание номер два с Itarable не уверена что получилось, поскольку не
         * поняла как надо сделать, сделала альтернативно как было на уроке в
         * StudentGroup, но все же не до конца поняла смысл его применения тут вообще
         * или не поняла задание просто
         */

        // Person man = new Person("Денис", "Криницын", 35);
        // // System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        // // System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(pers1);

        StudentGroup group4335 = new StudentGroup(listStud, 4335);
        // added new Group of students
        Student s7 = new Student("Inna", "James", 29, 23);
        Student s8 = new Student("Igor", "Petrov", 26, 78);
        Student s9 = new Student("Anna", "Kostyakova", 31, 2);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);

        StudentGroup group8787 = new StudentGroup(listStud2, 8787);

        Student s10 = new Student("Alexandra", "Gosteli", 30, 99);
        Student s11 = new Student("Aria", "Gosteli", 19, 92);
        Student s12 = new Student("Anna", "Ivanova", 23, 6);
        Student s13 = new Student("Nika", "Kokosheva", 21, 88);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);

        StudentGroup group777 = new StudentGroup(listStud3, 777);

        StudentStream streamgroup1 = new StudentStream(listStud, 4335, 1);

        StudentStream streamgroup2 = new StudentStream(listStud2, 8787, 2);

        StudentStream streamgroup3 = new StudentStream(listStud3, 777, 2);

        // System.out.println(streamgroup1.getGroup());
        // System.out.println(streamgroup2.getGroup());
        // System.out.println(streamgroup3.getGroup());
        int streamIDgroup1 = streamgroup1.getStreamID();
        System.out.println(streamIDgroup1);
        int streamIDgroup2 = streamgroup2.getStreamID();
        System.out.println(streamIDgroup2);
        int streamIDgroup3 = streamgroup3.getStreamID();
        System.out.println(streamIDgroup3);
        /**
         * stream id for groups
         */

        List<Student> stream1 = new ArrayList<>();
        if (streamgroup1.getStreamID() == 1) {
            stream1.addAll(listStud);
        }
        if (streamgroup2.getStreamID() == 1) {
            stream1.addAll(listStud2);
        }
        if (streamgroup3.getStreamID() == 1) {
            stream1.addAll(listStud3);
        }
        List<Student> stream2 = new ArrayList<>();
        if (streamgroup1.getStreamID() == 2) {
            stream2.addAll(listStud);
        }
        if (streamgroup2.getStreamID() == 2) {
            stream2.addAll(listStud2);
        }
        if (streamgroup3.getStreamID() == 2) {
            stream2.addAll(listStud3);
        }
        System.out.println("Stream 1 : " + stream1);
        System.out.println("Stream 2 : " + stream2);

        Collections.sort(stream1);

        System.out.println("Stream 1 : " + stream1);
        Collections.sort(stream2);
        System.out.println("Stream 2 : " + stream2);
        // List<Student> listStudAll = new ArrayList<Student>();
        // listStudAll.addAll(listStud);

        // listStudAll.addAll(listStud2);

        // listStudAll.addAll(listStud3);
        // System.out.println(listStudAll);

        // Collections.sort(listStudAll);

        // System.out.println(group4335);
        // через for не получилось вывести, потому что печатается через toString в
        // потоке
        // наверное

        // for (Student student : stream1) {
        // System.out.println(student.toString());
        // }

        // System.out.println(streamgroup2);

        // System.out.println(group4335.toString());

        // for (Student stud : group4335) {
        // System.out.println(stud.toString());
        // }

        // System.out.println("===============================");
        // Collections.sort(group4335.getGroup());

        // for (Student stud : group4335) {
        // System.out.println(stud.toString());
        // }

        // for (Student stud : group4335) {
        // System.out.println(stud.toString());
        // }
        // /**
        // * семинар 4, генерики
        // */
        // Student s1 = new Student("Сергей", "Иванов", 22, 101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        // Teacher t1 = new Teacher(null, null, 0, null);
        // Teacher t2 = new Teacher(null, null, 0, null);

        // Person p1 = new Student(null, null, 0, 0);
        // Person p2 = new Teacher(null, null, 0, null);

        // PersonComparator<Student> compS = new PersonComparator<Student>();
        // compS.compare(s1, s2);
        // PersonComparator<Teacher> compT = new PersonComparator<Teacher>();
        // compT.compare(t1, t2);
        // PersonComparator<Person> compP = new PersonComparator<Person>();
        // compP.compare(p1, p2);
        // Emploee emp1 = new Emploee("Борис", "Иванов", 40, "basic");
        // // EmploeeController empCont = new EmploeeController();
        // // empCont.paySalary(emp1);

        // // а если static добавить перед paySalary():

        // EmploeeController.paySalary(emp1);
        // }
    }
}