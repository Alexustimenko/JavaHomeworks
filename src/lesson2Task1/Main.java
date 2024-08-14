package lesson2Task1;

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Alex",254.77);
        System.out.println(empl1.calculateSalary());
        Manager man1 = new Manager("Eva",900,100);
        System.out.println(man1.calculateSalary());
    }
}
