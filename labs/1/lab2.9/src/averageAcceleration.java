import java.util.Scanner;
public class averageAcceleration {
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//promt user to enter the starting velocity 
		System.out.println("Enter the starting velocity in meters/second: ");
		double v0 = input.nextDouble();
		
		//promt user to enter the ending velocity 
		System.out.println("Enter the ending velocity in meters/second: ");
		double v1 = input.nextDouble();
		
		//promt user to enter the time span
		System.out.println("Enter the time span in t in seconds: ");
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;
		System.out.println("The average acceleration is: " + a);
		
		//closing the scanner
		input.close();
	}
}
