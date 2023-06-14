package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller {
    /**
     *  
     * 
     * */
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    /**
     * Не смогла решить вопрос с enum и командами цифрами,
     * пришлось просить пользователя писать прописью номер студента
     * которого хотят удалить
     */

    public void run() {
        Commands com = Commands.NONE;
        int n = 10;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду LIST, DELETE, EXIT или ENG (for English):");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case ENG:
                    String commandEng = view.prompt(" Enter task LIST or EXIT , DELETE: ");
                    com = Commands.valueOf(commandEng.toUpperCase());
                    switch (com) {
                        case LIST:
                            getAllStudents();
                            ViewEng.printAllStudentsEng(students);
                            break;

                        case EXIT:
                            getNewIteration = false;
                            System.out.println("GOODBYE!");
                            break;

                        case DELETE:
                            getAllStudents();
                            commandEng = view
                                    .prompt("Enter the number of student which you would like to delete from 1 to "
                                            + students.size()
                                            + " like this : one, two, three, four, five, six : ");
                            com = Commands.valueOf(commandEng.toUpperCase());

                            switch (com) {
                                case ONE:
                                    iGetModel.deleteStudent(students, 0);

                                    break;

                                case TWO:
                                    iGetModel.deleteStudent(students, 1);

                                    break;
                                case THREE:
                                    iGetModel.deleteStudent(students, 2);

                                    break;
                                case FOUR:
                                    iGetModel.deleteStudent(students, 3);

                                    break;
                                case FIVE:
                                    iGetModel.deleteStudent(students, 4);

                                    break;
                                case SIX:
                                    iGetModel.deleteStudent(students, 5);

                                    break;
                            }

                    }
                    break;
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    getAllStudents();
                    String comm = view.prompt("Введите номер студента от 1 до " + students.size()
                            + " прописью: one, two, three, four, five, six : ");
                    com = Commands.valueOf(comm.toUpperCase());
                    // long numberOfStudent = Long.parseLong(comm, 1, 1000, 0);
                    // int numb = 10;
                    switch (com) {
                        case ONE:
                            iGetModel.deleteStudent(students, 0);

                            break;

                        case TWO:
                            iGetModel.deleteStudent(students, 1);

                            break;
                        case THREE:
                            iGetModel.deleteStudent(students, 2);

                            break;
                        case FOUR:
                            iGetModel.deleteStudent(students, 3);

                            break;
                        case FIVE:
                            iGetModel.deleteStudent(students, 4);

                            break;
                        case SIX:
                            iGetModel.deleteStudent(students, 5);

                            break;
                    }

            }
        }
    }

}