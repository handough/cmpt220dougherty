
public class TestCircle2D {
	public static void main(String[] args){
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("Area: " + c1.getArea(2));
		System.out.println("Perimeter: " + c1.getPerimeter(4));
		System.out.println("A: " + c1.contains(new Circle2D(3, 3, 0)));
		System.out.println("B: " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("C: " + c1.contains(new Circle2D(3, 5, 2.3)));
		
	}
}
