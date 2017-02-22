import java.util.Scanner;
public class smallestNumber {
	public static void main (String[] args) {
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		//declare array
		double[] array = new double[9];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number: ");
			array[i] = input.nextDouble();	
		}
		
		//closing scanner
		input.close();
		
		indexOfSmallestElement(array);
		
	}
	public static double indexOfSmallestElement(double[] array) {
		double index = array[0];
		//searching array
		for (int i = 1; i < array.length; i++) {
			if (array[i] > index) {
				index = array[i];
			}
		}
		System.out.println(index);
		return index;
	}
}

