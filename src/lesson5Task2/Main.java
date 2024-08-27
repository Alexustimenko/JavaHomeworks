package lesson5Task2;

public class Main {
    public static void main(String[] args) {
        HoursWorker w1 = new HoursWorker("Willington",5);
        FullTimeWorker w2 =new FullTimeWorker("Sergov",100);
        System.out.println(w1.getSurname() + " Зарплата : " + w1.salary_calculator());
        System.out.println(w2.getSurname() + " Зарплата : " + w2.salary_calculator());
    }
}
