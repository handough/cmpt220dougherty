
public class TestRectangle{
	public static void main(String[] args){
		Rectangle rectangleOne = new Rectangle(4, 40);
		
		System.out.println("Rectangle one: ");
		System.out.println("The width of rectangle one is: " + rectangleOne.width);
		System.out.println("The height of rectangle one is: " + rectangleOne.height);
		System.out.println("The area of rectangle one is: " + rectangleOne.getArea());
		System.out.println("The perimeter of rectangle one is: " + rectangleOne.getPerimeter());
		
		
		Rectangle rectangleTwo = new Rectangle(3.5, 39.5);
		
		System.out.println("Rectangle two: ");
		System.out.println("The width of rectangle one is: " + rectangleTwo.width);
		System.out.println("The height of rectangle one is: " + rectangleTwo.height);
		System.out.println("The area of rectangle one is: " + rectangleTwo.getArea());
		System.out.println("The perimeter of rectangle one is: " + rectangleTwo.getPerimeter());
		
	}
}