import java.util.Scanner;

public class SubtractionQuiz {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//generate two random single-digit integers 
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		//if number1 < number2 swap them
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		//prompt the student for the answer
		System.out.println("Whats is " + number1 + " - " + number2 + "?");
		
		int answer = input.nextInt();
		//grade the answer
		if(number1 - number2 == answer) {
			System.out.println("You are correct!");
		}
		else {
			System.out.println("Your answer is wrong!");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2) + "!");
		}
		
		//closing scanner
		input.close();
	}
}
