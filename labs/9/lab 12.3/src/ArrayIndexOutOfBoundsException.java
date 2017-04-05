import java.util.Scanner;
public class ArrayIndexOutOfBoundsException{
	public static void main(String[] args) {
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		// creating an array with 100 random integers
        int[] array = new int[100];
        
        //array for integers
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        
        System.out.print("Enter an index: ");
        
        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } 
        catch (IndexOutOfBoundsException ex) {
            System.out.println("index " + ex.getLocalizedMessage() + " is out of bounds");
        } 
        catch (Exception ex) {
            System.out.println("invalid input!");
        }
        input.close();
    }
}