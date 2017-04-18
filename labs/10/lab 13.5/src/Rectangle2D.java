import java.awt.Rectangle;
public class Rectangle2D extends GeometricObject {

    public static double centerX;
    public static double centerY;

    public double width;
    public double height;

    public Rectangle2D(double centerX, double centerY, double width, double height) {
        Rectangle2D.centerX = centerX;
        Rectangle2D.centerY = centerY;
        this.width = width;
        this.height = height;
    }

    public Rectangle2D(MyPoint centerPoint, double width, double height) {
        this(MyPoint.X, MyPoint.Y, width, height);
    }

    public Rectangle2D(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public Rectangle2D() {
        this(0, 0, 1, 1);
    }
    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        Rectangle2D.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        Rectangle2D.centerY = centerY;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {

        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public boolean contains(Rectangle2D r2) {
        double xDistance = (Rectangle2D.centerX > centerX) ? Rectangle2D.centerX - centerX : centerX - Rectangle2D.centerX;
        double yDistance = (Rectangle2D.centerY > centerY) ? Rectangle2D.centerY - centerY : centerY - Rectangle2D.centerY;

        // if the r2 is inside this rectangle
        // this is only valid if the rectangles are parallel
        return (xDistance <= (width - r2.width) / 2 && yDistance <= (height - r2.height) / 2);

    }

    public boolean overlaps(Rectangle2D r2) {
        // subtract from the highest number
        double xDistance = (Rectangle2D.centerX > centerX) ? Rectangle2D.centerX - centerX : centerX - Rectangle2D.centerX;
        double yDistance = (Rectangle2D.centerY > centerY) ? Rectangle2D.centerY - centerY : centerY - Rectangle2D.centerY;

        return (xDistance <= (width + r2.width) / 2 && yDistance <= (height + r2.height) / 2);

    }
    public boolean contains(MyPoint[] points) {

        for (MyPoint p : points) {
            if (!contains(p)) return false;
        }
        return true;
    }

    public boolean contains(MyPoint point) {
        return contains(MyPoint.X, MyPoint.Y);
    }

    private boolean contains(double x, double y) {
		return false;
	}

	@Override
    public String toString() {
        return "MyRectangle2D{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}