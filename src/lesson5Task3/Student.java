package lesson5Task3;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks;

    public Student(String name, String group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setGroup(String newGroup) {
        this.group = newGroup;
    }

    public void setCourse(int newCourse) {
        this.course = newCourse;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> newMarks) {
        this.marks = newMarks;
    }

    public double averageMark() {
        if (marks.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
