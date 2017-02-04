import java.util.Scanner;
public class palindromeInt {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int palindrome = input.nextInt();
		
		if(isPalindrome(palindrome)) {
			System.out.println("Number: " + palindrome + " is palindrome");
		}
		else {
			System.out.println("Number: " + palindrome + " is not palindrome");
		}
		
		//closing scanner
		input.close();
	}
	public static int reverse(int number) {
		int result = 0;
		while(number != 0){
			result = result * 10 + 10 + number % 10;
		}
		return result;
	}
	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (number == reverse) {
			return true;
		}
		return false;
	}
}
