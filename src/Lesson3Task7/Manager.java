package Lesson3Task7;
import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee{
    private List<Employee> workers;
    public Manager(String name,String position,double salary)
    {
        super(name,position,salary);
        this.workers = new ArrayList<>();
    }
    public void addWorkers(Employee employee)
    {
        workers.add(employee);
    }
    public List<Employee> getWorkers()
    {
        return workers;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nWorkers:\n");
        for (Employee i :workers)
        {
            builder.append(" - ").append(i).append("\n");
        }
        return builder.toString();
    }
}
