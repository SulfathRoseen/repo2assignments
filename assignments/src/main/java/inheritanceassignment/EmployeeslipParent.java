package inheritanceassignment;
import java.util.Scanner;
public class EmployeeslipParent {
int basicpay;
int deduction;
int bonus;
Scanner a=new Scanner(System.in);
public void show()
{
System.out.println("Enter Basic pay:");	
basicpay=a.nextInt();
System.out.println("Enter Deduction:");
deduction=a.nextInt();
System.out.println("Enter Bonus:");
bonus=a.nextInt();
}
public void display()
{
	System.out.println("Basic Pay: " + basicpay);
	System.out.println("Deduction: " +deduction);
	System.out.println("Bonus: "+bonus);
}
}
