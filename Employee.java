import java.util.Scanner;
public class Employee
{
private int id;
private int salary;

public void setSalary(int mysalary)
{
this.salary = mysalary;
}
 
public String getSalary(int salary)
{
if(salary<10000)
{
//System.out.println("less than 10000");
}
return "Error:less than 10000";
}

public static void main(String args[])
{
Employee E1 = new Employee();
Scanner obj = new Scanner(System.in);
System.out.print("Enter the salary:");
int s = obj.nextInt();
E1.setSalary(s);
System.out.println(E1.getSalary(s));
}
}