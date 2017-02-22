import java.util.Scanner;
public class sorted {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a number for the length of the list: ");
        int listLength = input.nextInt();
        int[] list = new int[listLength];
        
		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter a number: ");
			list[i] = input.nextInt();
		}
		//closing scanner
		input.close();
		
		if (isSorted(list)) {
            System.out.println("The list is sorted!");
        } 
		else {
            System.out.println("The list is not sorted!");
        }
	}
	public static boolean isSorted(int[] list) {
		for(int i = 0; i < list.length;) {
            if (list[i] > list[i + 1]) {
                return false;
            } 
            else {
                return true;
            }
        }
        return false;
	}
}
