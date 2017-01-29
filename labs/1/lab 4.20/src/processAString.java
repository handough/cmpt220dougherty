import java.util.Scanner;
public class processAString {
	public static void main(String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		//the string
		String string = input.next();
		
		//the length of the string
		System.out.println("The length of the string is: " + string.length() + ".");
		
		//the first character
		System.out.println("The first character is: " + string.charAt(0) + ".");
		
		//closing scanner
		input.close();
		
	}

}
