package lesson5Task2;

public class HoursWorker extends Workers{
    private double hoursPay;
    public HoursWorker(String surname,double hoursPay)
    {
        super(surname);
        this.hoursPay=hoursPay;
    }
    public double getHoursPay()
    {
        return hoursPay;
    }
    public void setHoursPay(double pay)
    {
        this.hoursPay=pay;
    }
    @Override
    public double salary_calculator()
    {
        return 20.8*8*hoursPay;
    }
}
