package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

/**
 * 2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс
 * iUserController.
 * done, not having an academDegree yet
 */
public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teacherDataService = new TeacherService(null);

    @Override
    public void create(String firstName, String SecondName, int age) {
        teacherDataService.create(firstName, SecondName, age);
    }

}
