import java.util.Scanner;
public class printChar {
    private static Scanner scanner;

	public static void main(String[] args) {

        System.out.print("Enter a string: ");
        scanner = new Scanner(System.in);
		String value = scanner.nextLine();
        reverseDisplay(value);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1));
        reverseDisplay(value.substring(0, value.length()-1));
    }
}
