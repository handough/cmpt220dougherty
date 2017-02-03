import java.util.Scanner;
public class factorOfAnInt {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println("The factors of " + number + " are: ");
		
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				number = number / i;
				i++;
			}
			System.out.println(number);
		}
		
		//closing scanner
		input.close();
	}

}
