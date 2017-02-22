import java.util.Scanner;
public class addTwoMatrices {
	public static void main(String[] args){
	    double[][] a = new double[3][3];
	    double[][] b = new double[3][3];
		addMatrix(a,b);
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		//opening the scanner
		Scanner input = new Scanner(System.in);
	 
	    for(int i = 0; i < 3; i++){
	    	for(int j = 0; j < 3; j++){
	    		System.out.println("Enter a number for the first matrix: ");
	    		a[i][j] = input.nextInt();
	    	}
	    }
	    for(int i = 0; i < 3; i++){
	    	for(int j = 0; j < 3; j++){
	    		System.out.println("Enter a number for the second matrix: ");
	    		b[i][j] = input.nextInt();
	    	}
	    }
	    
	    double[][] c = new double[3][3];
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		c[i][j] = a[i][j] + b[i][j];
	    	}
	    }
	    
	    System.out.println("Matrice #1: ");
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		System.out.print(a[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("Matrice #2: ");
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		System.out.print(b[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("The sum of the two matrices is: ");
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		System.out.print(c[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	    //closing scanner
	    input.close();
	    
	    return c;
	}
}
