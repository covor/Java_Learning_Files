package AbstractClasses;
import java.time.*;
public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }
    public  double getSalary()
    {
        return salary;
    }
    public LocalDate getHireday() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raisesalary(double bypercent)
    {
        double raise = salary * bypercent/100;
        salary += raise;
    }
}
