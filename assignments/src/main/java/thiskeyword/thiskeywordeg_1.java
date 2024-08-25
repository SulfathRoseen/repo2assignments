package thiskeyword;

public class thiskeywordeg_1 {
	int number;
	 int reverse;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		thiskeywordeg_1 a=new thiskeywordeg_1(num);
		a.display();
		thiskeywordeg_1 b=new thiskeywordeg_1(num);
		b.display();

	}
	public thiskeywordeg_1(int number)
	{
		 this.number = number;
		 calculateReverse(); 
	}
	public thiskeywordeg_1()
	{
}
	 private void calculateReverse() {
	        int num = number;
	        int rev = 0;
	        while (num != 0) {
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        this.reverse = rev; 
}
	 private void display() {
		 
	        System.out.println("Reverse of the number: " +this.reverse);
	    }
	 
}