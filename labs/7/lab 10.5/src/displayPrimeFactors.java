import java.util.Scanner;
import java.util.*;
public class displayPrimeFactors {
	public static void main(String[] args){
		System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        Stack<Integer> factors = new Stack<Integer>();
        if(isPrime(number)){
        	System.out.println("The number is prime " + number);
        }
        else{
            for(int i = 2; i <= (number); i++){
            	while (number % i == 0) {
            		factors.push(number);
            	    number /= i;
            	}
            }
            factors.push(1);
            Collections.reverse(factors);
            System.out.println(factors);
        }

        scanner.close();
	}
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++){
			if(number % i == 0){
			 return false;
		  }
		}
		return true;
	}

}
