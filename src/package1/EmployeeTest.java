package package1;
import java.time.*;
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("Cal Cracker",75000,1897,12,15);
        staff[1]=new Employee("Harry Hacker",5000,1989,10,1);
        staff[2]=new Employee("Tony Tester",40000,1990,3,15);
        for(Employee e: staff)
            e.raiseSalary(50);
        for(Employee e: staff)
            System.out.println("name="+ e.getName()+", salary= "+e.getSalary()+", hireday="+e.getHierDay());

    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hierDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hierDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHierDay(){
        return hierDay;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent/100;
        salary+=raise;
    }
}