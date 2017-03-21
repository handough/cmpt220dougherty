
public class Circle2D {
	double x = 0;
	double y = 0;
	double radius;
	
	public Circle2D(double newX, double newY, double newR){
		radius = newR;
		x = newX;
		y = newY;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getRadius(){
		return radius;
	}
	public Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}
	public boolean contains(int x2, int y2){
		if(Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2)) <= radius){
			return true;
		}
		else{
			return false;
		}
	}
	public int getArea(int area){
		area = (int)(Math.PI * (radius * radius));
		return area;
	}
	public int getPerimeter(int perimeter){
		perimeter = (int)(2 * Math.PI * radius);
		return perimeter;
	}
	public boolean contains(Circle2D circle){
		double x2 = circle.getX();
		double y2 = circle.getY();
		double distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
		
		if(distance <= radius - circle.getRadius()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean overlaps(Circle2D circle){
		double x2 = circle.getX();
		double y2 = circle.getY();
		double distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
		
		if(distance <= radius + circle.getRadius()){
			return true;
		}
		else{
			return false;
		}
	}
}

