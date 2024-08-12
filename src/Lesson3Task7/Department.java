package Lesson3Task7;
import java.util.ArrayList;
import java.util.List;
public class Department {
    private String name;
    private List<Employee> employees;
    private Manager manager;
    public Department(String name)
    {
        this.name=name;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void setManager(Manager manager)
    {
        this.manager=manager;
    }
    public String getDepartmentInfo() {
        StringBuilder sb = new StringBuilder("Department: " + name);
        sb.append("\nEmployees:\n");
        for (Employee employee : employees) {
            sb.append(" - ").append(employee).append("\n");
        }
        if (manager != null) {
            sb.append("\nManager:\n").append(manager);
        } else {
            sb.append("\nNo manager assigned.");
        }
        return sb.toString();
    }
}
