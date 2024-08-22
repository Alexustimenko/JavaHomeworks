package lesson5Task3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Student> group = new ArrayList<>();
        group.add(new Student("Aleksei", "777", 2, Arrays.asList(10, 10, 10)));
        group.add(new Student("Tom", "100", 2, Arrays.asList(3, 3, 3)));
        group.add(new Student("Bob", "111", 2, Arrays.asList(10, 9, 10)));
        group.add(new Student("Sam", "747", 4, Arrays.asList(8, 9, 7)));
        group.add(new Student("Bill", "754", 3, Arrays.asList(10, 10, 9)));

        University university = new University(group);


        university.removeAvg3();


        university.nextCourse();

        university.printStudents(3);
    }
}
