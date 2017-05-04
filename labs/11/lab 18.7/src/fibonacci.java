import java.util.Scanner;
public class fibonacci {
    static long count;
	private static Scanner scanner;
	
    public static void main(String args[]) {
        System.out.print("Enter an index for the Fibonacci number: ");
        scanner = new Scanner(System.in);
		int index = scanner.nextInt();

        System.out.println("Fibonacci number at index " + index + " is " + fib(index));

        System.out.println("The fib method was called " + count + " times");
    }
    
    public static long fib(long index) {
        count++;
        if (index == 0)
            return 0;
        else if (index == 1) 
            return 1;
        else 
            return fib(index - 1) + fib(index - 2);
    }
}
