import java.util.Scanner;
public class greatestCommonDivisor {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		//the first integer
		System.out.println("Enter first integer: ");
		int n1 = input.nextInt();
		//the second integer 
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k; //update gcd
				
			}
			k++;
		}
		System.out.println("The greatest common divisor of " + n1 + " and " 
		+ n2 + " is " + gcd);
		
		//closing scanner
		input.close();
	}

}
