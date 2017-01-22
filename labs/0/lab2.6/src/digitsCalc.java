import java.util.Scanner;
public class digitsCalc {
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//users number between 0-1000
		System.out.println("Enter a number between 0-1000: ");
		int number = input.nextInt();
		
		//ones digit
		int ones = number % 10;
		
		//tens digit
		int tens = (number / 10) % 10;
		
		//hundreds digit
		int hundreds = number / 100;
		
		//adding all three digits
		int total = ones + tens + hundreds;
		
		//printing out the answer
		System.out.println("The total of all three digits is: " + total);
		
		//closing the scanner
		input.close();
	}
}
