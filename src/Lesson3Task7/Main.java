package Lesson3Task7;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex","Programmer",100000);
        Employee employee2 = new Employee("Sofia","Recruter",500000);
        Employee employee3 = new Employee("David","Data Scientist",72000);
        Manager manager1 = new Manager("Bob","Manager",7777777);
        manager1.addWorkers(employee1);
        manager1.addWorkers(employee2);
        Department department = new Department("IT");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        department.setManager(manager1);
        System.out.println(department.getDepartmentInfo());
    }
}
