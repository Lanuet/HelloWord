import test.Classroom;
import test.Student;

import java.util.ArrayList;

/**
 * Created by nguye on 6/20/2017.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello !");
        Classroom classroom = new Classroom();
        Student student = new Student(12,"Lan", 9.0);
        Student student1 = new Student(20, "Huyen", 9.1);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.showList();
    }
}
