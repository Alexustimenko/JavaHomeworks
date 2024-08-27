package lesson5Task2;
public abstract class Workers {
    private String surname;
    public Workers(String surname)
    {
        this.surname=surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String newSurname)
    {
        this.surname=newSurname;
    }
    public abstract double salary_calculator();
}
