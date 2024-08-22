package lesson5Task2;

public class FullTimeWorker extends Workers{
    private double salary;
    public FullTimeWorker(String surname,double salary)
    {
        super(surname);
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        this.salary=newSalary;
    }
    @Override
    public double salary_calculator()
    {
        return salary;
    }
}
