package equals;
import java.time.*;
import java.util.Objects;
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name,double salary,int year, int month,int day)
    {
        this.name= name;
        this.salary =salary;
        hireday= LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return  name;
    }
    public  double getSalary()
    {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }
    public void raiseSalary(double bypercent)
    {
        double raise = salary * bypercent/100;
        salary += raise;
    }
    public boolean equals(Object otherobject)
    {
        if(this == otherobject) return true;
        if(otherobject == null) return false;
        if(getClass()!=otherobject.getClass()) return false;
        Employee other = (Employee)otherobject;
        return Objects.equals(name,other.name)&&salary == other.salary&&Objects.equals(hireday,other.hireday);
    }
    public int hashCode()
    {
        return Objects.hash(name,salary,hireday);
    }
    public String toString()
    {
        return getClass().getName()+"[name="+name+" ,salary="+salary+" , hireday="+hireday+"]" ;
    }
}
