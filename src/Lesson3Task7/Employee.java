package Lesson3Task7;

public class Employee {
    private String name;
    private String dolzhnost;
    private double salary;
    public Employee(String name,String dolzhnost, double salary)
    {
        this.name=name;
        this.dolzhnost=dolzhnost;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public String getDolzhnost()
    {
        return dolzhnost;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return name + "(" + dolzhnost + ") - $"+salary;
    }
}
