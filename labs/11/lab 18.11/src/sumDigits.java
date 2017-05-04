import java.util.Scanner;
public class sumDigits {
	private static Scanner input;
	public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.println(sumDigits1(n));

    }
    public static long sumDigits1(long n) {

        if (n == 0)
            return n;

        return n % 10 + sumDigits1(n / 10);
    }
}