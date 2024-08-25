package assignmentsul;

public class LinearsearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {3, 5, 7, 9, 11, 13};
		  int target = 8;
		  boolean found = false;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                System.out.println("Element " + target + " found at index " + i);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }
	}

