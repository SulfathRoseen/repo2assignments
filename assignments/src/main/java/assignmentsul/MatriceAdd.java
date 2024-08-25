package assignmentsul;

public class MatriceAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[2][2];
		array[0][0]=2;
		array[0][1]=4;
		array[1][0]=6;
		array[1][1]=8;
		int array1[][]=new int[2][2];
		array1[0][0]=2;
		array1[0][1]=4;
		array1[1][0]=6;
		array1[1][1]=8;
		 int result[][] = new int[2][2];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
		{
				result[i][j] = array[i][j] + array1[i][j];
	}		
}
		 for (int i = 0; i < result.length; i++)
		 {
	            for (int j = 0; j < result[i].length; j++)
	            {
	                System.out.print( result[i][j] + " ");
	            }		
	}
}
}