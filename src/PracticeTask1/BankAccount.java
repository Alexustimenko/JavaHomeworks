package PracticeTask1;

public class BankAccount
{
    private double balance;
    public BankAccount(double summa)
    {
        if (summa >= 0)
        {
            this.balance=summa;
        }
        else {
            System.out.println("Error balance");
        }
    }
    public void deposit(double money)
    {
        if (money>0)
        {
            balance+=money;
        }
        else {
            System.out.println("balance bis neg");
        }
    }
    public void withdraw(double money)
    {
        if (money>0)
        {
                if(money<=balance)
                {
                    balance-=money;
                }
                else {
                    System.out.println("Not enough");
                }
        }
        else {
            System.out.println("balance bis neg");
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
