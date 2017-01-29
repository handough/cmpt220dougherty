import java.util.Scanner;
public class AdditionQuiz {
	public static void main (String[] args) {
		//random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		//opening the scanner
		Scanner input = new Scanner(System.in); 
		
		System.out.print("What is " + number1 + " + " + number2 +
				" + " + number3 + "?");
		
		//retrieving the users input
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + 
				" = " + answer + " is " + (number1 + number2 + number3 == answer) + ".");
		
		//closing scanner
		input.close();
		
	}
}
