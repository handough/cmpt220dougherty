
public class Rectangle {
		double width = 1;
		double height = 1;
		
	public Rectangle(double width, double height){
		
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * width + 2 * height;
		return perimeter;
	}
}
