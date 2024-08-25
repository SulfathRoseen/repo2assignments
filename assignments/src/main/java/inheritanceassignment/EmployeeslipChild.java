package inheritanceassignment;

public class EmployeeslipChild extends EmployeeslipParent_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeslipChild a=new EmployeeslipChild();
		 a.show();
		 a.calculate();
		   a.generate();
		   a.display();
	        a.print();
	}
public double calculatesalary()
{
	return basicpay + hra - pf - deduction + bonus;	
}
public void generate()
{
	System.out.println("Salary Slip");
	System.out.println("Basic Pay: " +basicpay);
    System.out.println("HRA: " +hra);
    System.out.println("PF: " +pf);
    System.out.println("Deduction: " +deduction);
    System.out.println("Bonus: "+bonus);
	 double totalSalary = calculatesalary();
	 System.out.println("Total Salary by Hand: " + totalSalary);
}
}
