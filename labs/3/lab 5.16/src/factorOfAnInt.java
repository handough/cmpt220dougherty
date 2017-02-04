import java.util.Scanner;
public class factorOfAnInt {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		for (int factor = 2; factor * factor <= number; factor++) {
			while (number % factor == 0) {
				System.out.print(factor + ", ");
				number = number / factor;
			}
		}
		
		if (number > 1) {
			System.out.print(number);
		}
		else {
			System.out.println();
		}
		//closing scanner
		input.close();
	}
}
