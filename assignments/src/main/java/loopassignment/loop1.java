package loopassignment;
import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("Enter your number");
int b=a.nextInt();
int orginalnumber=b;
int reversed=0;
while (b!= 0)
{
	int remainder=b% 10;
	reversed = reversed * 10 + remainder; 
 b/=10;
}
 System.out.println("Reversed Number: " + reversed);
 System.out.println("orginalnumber " + orginalnumber);
}
	}


