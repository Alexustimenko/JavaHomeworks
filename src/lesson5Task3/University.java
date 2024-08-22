package lesson5Task3;

import java.util.List;
import java.util.Iterator;

public class University {
    private List<Student> nabor;

    public University(List<Student> nabor) {
        this.nabor = nabor;
    }

    public void removeAvg3() {
        Iterator<Student> iterator = nabor.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageMark() == 3.0) {
                iterator.remove();
            }
        }
    }

    public void nextCourse() {
        for (Student student : nabor) {
            student.setCourse(student.getCourse() + 1);
        }
    }

    public void printStudents(int course) {
        System.out.println("Студенты на курсе номер " + course + ": ");
        for (Student student : nabor) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public List<Student> getNabor() {
        return nabor;
    }
}
