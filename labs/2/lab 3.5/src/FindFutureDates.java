import java.util.Scanner;
public class FindFutureDates {
	public static void main(String[] args) {
		
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a integer for todays day of the week:" );
		System.out.println("(Sunday: 0, Monday: 1, Tuesday: 2, Wednesday: 3, " +
		"Thursday: 4, Friday: 5, Saturday: 6)");
		
		//retrieving the users input
		int day = input.nextInt();
		
		//the days elapsed since today
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		//elapsed day calculation
		int elapsedDays = day + elapsed % 7;
		
		//the day
		if (day == 0) { 
			System.out.print("Today is Sunday ");
		}
		else if (day == 1) {
			System.out.print("Today is Monday ");
		}
		else if (day == 2) {
			System.out.print("Today is Tuesday ");
		}
		else if (day == 3) {
			System.out.print("Today is Wednesday ");
		}
		else if(day == 4) {
			System.out.print("Today is Thursday ");
		}
		else if(day == 5) {
			System.out.print("Today is Friday ");
		}
		else if(day == 6) {
			System.out.print("Today is Saturday ");
		}
		//the elapsed day 
		if (elapsedDays == 0) { 
			System.out.print("and the future day is Sunday.");
		}
		else if (elapsedDays == 1) {
			System.out.print("and the future day is Monday.");
		}
		else if (elapsedDays == 2) {
			System.out.print("and the future day is Tuesday.");
		}
		else if (elapsedDays == 3) {
			System.out.print("and the future day is Wednesday.");
		}
		else if(elapsedDays == 4) {
			System.out.print("and the future day is Thursday.");
		}
		else if(elapsedDays == 5) {
			System.out.print("and the future day is Friday.");
		}
		else if(elapsedDays == 6) {
			System.out.print("and the future day is Saturday.");
		}
		//closing scanner
		input.close();
	}
}
