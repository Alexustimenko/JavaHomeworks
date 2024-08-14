package PracticeTask1;

public class Task1 {
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount(100);
        System.out.println(acc.getBalance());
        acc.deposit(50);
        System.out.println(acc.getBalance());
        acc.withdraw(70);
        System.out.println(acc.getBalance());
    }
}
//Создайте класс BankAccount с методами deposit() и withdraw(). Напишите
//программу, в которой выполняются операции
//пополнения и снятия средств со счета.