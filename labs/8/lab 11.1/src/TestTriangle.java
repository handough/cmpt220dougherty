import java.text.DecimalFormat;
import java.util.Scanner;
public class TestTriangle {
	private static Scanner input;
	public static void main(String[] args){
		Triangle t = new Triangle();
		input = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		double side1 = t.getSide1(input.nextDouble());
		System.out.print("Enter side 2: ");
		double side2 = t.getSide2(input.nextDouble());
		System.out.print("Enter side 3: ");
		double side3 = t.getSide3(input.nextDouble());
		
		System.out.println("Enter a color: ");
		String color = input.next();
		
		System.out.print("Is the triangle filled? Enter true or false: ");
        String isFilled = input.next();
		
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("The sides lengths are: " + side1 + " " + side2 + " " + side3);
        System.out.println("The area of the triangle is: " + df.format(t.getArea()));
        System.out.println("The perimeter of the triangle is: " + df.format(t.getPerimeter()));
        System.out.println("The color of the triangle is: " + color);
        System.out.println("It is " + isFilled + " that the triangle is filled.");

	}
}
