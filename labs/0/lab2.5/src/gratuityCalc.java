import java.util.Scanner;
public class gratuityCalc {
	public static void main (String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//the subtotal
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		
		//the gratuity rate
		System.out.println("Enter the gratuity rate(%) as a decimal: ");
		double gratuityRate = input.nextDouble();
		
		//calculating the gratuity
		double gratuity = subtotal * gratuityRate;
		
		//calculating the total
		double total = subtotal + gratuity;
		
		//printing out the totals
		System.out.println("The gratuity is: " + gratuity + " the total is: " + total);
		
		//closing the scanner
		input.close();
	}
}
