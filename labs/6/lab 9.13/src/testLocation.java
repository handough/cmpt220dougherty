import java.util.Scanner;
public class testLocation {
	public static void main(String[] args){
		//creating scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = scanner.nextInt();
		
		double[][] ar = new double[rows][columns];
		
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
            	System.out.println("Enter the array: ");
                ar[i][j] = scanner.nextDouble();
            }
        }
        
		scanner.close();
		Location location = Location.locateLargest(ar, rows, columns);
		location.getRow(rows);
		location.getColumn(columns);
		System.out.println("The location of the largest element is: " + location.maxValue
				+ " (" + location.row + ", " + location.column + ")");
	}
}
