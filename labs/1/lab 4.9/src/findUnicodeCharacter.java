import java.util.Scanner;
public class findUnicodeCharacter {
	public static void main(String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		String character = input.next();
		//changing string to character
		char ch = character.charAt(0);
		
		int i = (int)ch; 
		System.out.println(i);
		
		//closing scanner
		input.close();
	}

}
