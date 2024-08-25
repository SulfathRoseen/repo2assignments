package thiskeyword;

public class thiskeywordeg_2 {
	int number;
	long factorial;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num = 3;
		   thiskeywordeg_2 a  = new thiskeywordeg_2(num);
		   a.display();
				   
	}
	public thiskeywordeg_2(int number) 
	{
        this.number = number;
        calculateFactorial(this.number);
}
	 private void calculateFactorial(int number) {
	        factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        this.display();
}
	 private void display() {
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
}