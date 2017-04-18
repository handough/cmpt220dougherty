import java.util.Scanner;
public class TriangleRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) {
        	System.out.print("Enter a side of the triangle: ");
            sides[i] = input.nextDouble();
        }
        System.out.print("Enter a triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? Enter true or false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));

        newTriangle t1 = new newTriangle(sides[0], sides[1], sides[2]);
        t1.setColor(color);
        t1.setFilled(isFilled);
        System.out.println("Triangle 1:");
        System.out.println("The area = " + t1.getArea());
        System.out.println("The perimeter = " + t1.getPerimeter());
        System.out.println("The color = " + t1.getColor());
        System.out.println("Is it filled? " + t1.isFilled());
        
        input.close();
    }
}