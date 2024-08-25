package staticassignment;

public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age = 18;
		 if (eligible(age)) {
	            System.out.println("The candidate is eligible for voting.");
	        } else {
	            System.out.println("The candidate is not eligible for voting.");
	        }
	    }
	public static boolean eligible(int age) {
        return age >= 18;
    }
}

