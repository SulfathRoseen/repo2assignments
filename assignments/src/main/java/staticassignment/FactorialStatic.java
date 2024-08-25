package staticassignment;

public class FactorialStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Factorial of 5 is:"+FactorialStatic.factorial(5));
	}
public static int factorial(int a)
{
	int num=1;
	for (int i=1;i<=a;i++)
	{
		num*=i;
	}
	return num;
}
}
