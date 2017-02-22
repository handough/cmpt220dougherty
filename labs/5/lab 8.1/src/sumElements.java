import java.util.Scanner;
public class sumElements {
	public static void main(String[] args){
		int ROW = 3;
		int COLMN = 4;
		
		double[][] matrix = new double [ROW][COLMN];
		
		Scanner input = new Scanner(System.in);
		
		  System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns:");
		    for (int row = 0; row < matrix.length; row++) {
		      for (int column = 0; column < matrix[row].length; column++) {
		        matrix[row][column] = input.nextDouble();
		      }
		    }
		    //closing scanner
		    input.close();
		    
		    sumColumn(matrix, COLMN);
	}
	public static double sumColumn(double[][] m, int cIndex) {
	    double total = 0;
	    for (int column = 0; column < cIndex; column++) {
	      total = 0;
	      for (int row = 0; row < m.length; row++) {
	        total += m[row][column];
	      }
	      System.out.println("The sum for column "+ column + " is " + total);
	    }
	    return total;
	  }

}
