import java.util.Scanner;
public class labFahrenheitConverter {
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//retrieve the celsius temperature
		System.out.println("Enter the temperature you would like to convert to Fahrenheit:");
		double celsius = input.nextDouble();
		
		//the formula to convert the temperature
		double fahrenheit = (9/5) * celsius + 32;
		
		//printing the conversion
		System.out.println("The temperature " + celsius + " degrees celsius converts to: " +
		                   fahrenheit + " degrees fahrenheit.");
		
		//close the scanner
		input.close();
	}
}
