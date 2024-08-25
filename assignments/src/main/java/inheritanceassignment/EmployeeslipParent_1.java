package inheritanceassignment;

public class EmployeeslipParent_1 extends EmployeeslipParent{
	double hra;
double pf;
public void calculate()
{
hra= 0.05 * basicpay;
pf=0.20 * basicpay;
}
public void print()
{
	System.out.println(hra);
	System.out.println(pf);
}
}