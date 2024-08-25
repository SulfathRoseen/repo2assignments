package staticassignment;

public class Static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=101;
if (isPalindrome(num))
{
	  System.out.println("is a palindrome:"+num);
}
else
{
	 System.out.println("is not a palindrome:"+num);
}
	}
	public static boolean isPalindrome(int num)
	{
		int reversedNumber = reverse(num);
		 return num == reversedNumber;
	}
public static int reverse(int a)
{
int reverse=0;
while (a != 0)
{
	int remainder=a% 10;
	reverse = reverse * 10 + remainder;  
 a/=10;  
}
return reverse;
}

}
