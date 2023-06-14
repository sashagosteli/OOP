package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class hachModel implements iGetModel {
    public static List<Student> students;

    /**
     * 
     * 2) Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>,
     * подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.
     * 
     * Не уверена что правильно поняла задание, но я переделала лист(студентов) в
     * хэшмэп,
     * путем перебора листа по имени и добавлению к нему так же номера его индекса.
     * Не очень поняла как бы его потом отсортировать, потому что output пока что не
     * по очереди получается:
     * {Сергей=0, Лена=5, Игорь=3, Иван=2, Андрей=1, Даша=4}
     * 
     * поскольку у нам тут пока маленькие списки, ограничилась integer, а не long,
     * не стала пробовать переводить integer в long после получения индекса, думаю
     * такое было бы теоретически возможно
     */
    public static void hachModel(List<Student> students) {
        HashMap<String, Integer> studentsHashmap = new HashMap<>();
        for (Student stud : students) {
            Integer idx = students.indexOf(stud);
            studentsHashmap.put(stud.firstName, idx);

        }
        System.out.println(studentsHashmap);

    }

    @Override
    public List<Student> getAllStudents() {
        return students;

    }

}
