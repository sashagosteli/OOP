import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.Model;
import Model.Student;
import Model.hachModel;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        /**
         * v. hw5
         * 
         * 1) Сделать вариант класса ViewEng с текстом на английском языке, подключить к
         * нему интерфейс iGetView. Класс ViewEng подключить к контроллеру.
         * 2) Сделать вариант класса hachModel с хранилищем типа HashMap<Long,Student>,
         * подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.
         * 3) Добавить команду в метод run класса контролер по удалению студента:
         * Для этого: Добавить в switch команду DELETE
         * - запросить у пользователя номер студента на удаление
         * - вызов удаления у модели(метод добавить в интерфейс iGetModel)
         * - если такого нромера нет, то сообщить об этом
         * Весь код прокомментировать и добавить само-документацию.
         * 
         */

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 25, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        FileModel fModel = new FileModel("StudentsDB.txt");
        fModel.saveAllStudentToFile(students);

        iGetModel model = new Model(students);
        // iGetModel newFModel = fModel;
        iGetView view = new View();

        Controller controller = new Controller(view, model);
        // controller.update();

        controller.run();

        hachModel stuModel = new hachModel();

        stuModel.hachModel(students);
        /**
         * пока не получилось отсортировать по порядку индекса
         */

    }
}