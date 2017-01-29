import java.util.Scanner;
public class vowelOrConsonant {
	public static void main(String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String letter = input.next();
		String letters = letter.toLowerCase();
		
		char ch = letters.charAt(0);
		
		if (Character.isLetter(ch))
			if (ch == 'a') {
				System.out.println(letter + " is a vowel.");
				}
			else if (ch == 'e'){
				System.out.println(letter + " is a vowel.");
				}
			else if (ch == 'i') {
				System.out.println(letter + " is a vowel.");
				}
			else if (ch == 'o') {
				System.out.println(letter + " is a vowel.");
				}
			else if (ch == 'u') {
				System.out.println(letter + " is a vowel.");
				}
			else {
				System.out.println(letter + " is a consonant");
			}
		else {
			System.out.println(letter + " is invalid input");
		}
		//closing scanner
		input.close();
	}

}