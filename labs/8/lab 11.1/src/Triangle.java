
public class Triangle extends GeometricObject {
	double side1;
	double side2;
	double side3;
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(){
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	public double getSide1(double newSide1){
		return side1 = newSide1;
	}
	public double getSide2(double newSide2){
		return side2 = newSide2;
	}
	public double getSide3(double newSide3){
		return side3 = newSide3;
	}
	public double getArea(){
		double area;
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	public double getPerimeter(){
		double perimeter;
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + 
				" side3 = " + side3;
	}
}

