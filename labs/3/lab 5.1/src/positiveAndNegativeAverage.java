import java.util.Scanner;
public class positiveAndNegativeAverage {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, the input ends if it is 0:");
		
		int number = 0, total = 0;
		int count = 0, positive = 0, negative = 0;
		
		while((number = input.nextInt()) != 0) {
			total += number;
			count++;
			
			if (number > 0) {
				positive++;
			}
			else if (number < 0) {
				negative++;
			}	
		}
		
		//getting the average
		float average = total / (float) count;
		
		System.out.println("The number of positives is: " + positive);
		System.out.println("The number of negatives is: " + negative);
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + average);
		
		//closing scanner
		input.close();
	}
}
