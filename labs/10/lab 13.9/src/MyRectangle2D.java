import java.awt.Rectangle;
public class MyRectangle2D extends GeometricObject {

    private static final int X = 0;
    private static final int Y = 1;

    public double centerX;
    public double centerY;

    public double width;
    public double height;

    public MyRectangle2D(double centerX, double centerY, double width, double height) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D(MyPoint centerPoint, double width, double height) {
        this(MyPoint.X, MyPoint.Y, width, height);
    }

    public MyRectangle2D(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyPoint getCenterP() {
        return new MyPoint(centerX, centerY);
    }
    public MyPoint getP1() {
        return new MyPoint(centerX - width / 2, centerY + height / 2);
    }

    public MyPoint getP2() {
        return new MyPoint(centerX + width / 2, centerY + height / 2);
    }

    public MyPoint getP3() {
        return new MyPoint(centerX - width / 2, centerY - height / 2);
    }

    public MyPoint getP4() {
        return new MyPoint(centerX + width / 2, centerY - height / 2);
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
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

    public boolean contains(double x, double y) {
        getP4();
		getP3();
		getP1();
		getP2();
		double maxX = getMax(MyPoint.X, MyPoint.X, MyPoint.X, MyPoint.X);
        getP3();
		getP2();
		getP4();
		getP1();
		double maxY = getMax(MyPoint.Y, MyPoint.Y, MyPoint.Y, MyPoint.Y);
        getP4();
		getP1();
		getP3();
		getP2();
		double minX = getMin(MyPoint.X, MyPoint.X, MyPoint.X, MyPoint.X);
        getP3();
		getP2();
		getP4();
		getP1();
		double minY = getMin(MyPoint.Y, MyPoint.Y, MyPoint.Y, MyPoint.Y);

        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        return true;

    }

    public boolean contains(MyRectangle2D r2) {
        double xDistance = (r2.centerX > centerX) ? r2.centerX - centerX : centerX - r2.centerX;
        double yDistance = (r2.centerY > centerY) ? r2.centerY - centerY : centerY - r2.centerY;

        // if the r2 is inside this rectangle
        // this is only valid if the rectangles are parallel
        return (xDistance <= (width - r2.width) / 2 && yDistance <= (height - r2.height) / 2);

    }

    public boolean overlaps(MyRectangle2D r2) {
        // subtract from the highest number
        double xDistance = (r2.centerX > centerX) ? r2.centerX - centerX : centerX - r2.centerX;
        double yDistance = (r2.centerY > centerY) ? r2.centerY - centerY : centerY - r2.centerY;

        // if the r2 overlaps this rectangle
        // this is only valid if the rectangles are parallel
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

    public static MyRectangle2D getRectangle(double[][] points) {
        MyPoint[] myPoints = new MyPoint[points.length];
        for (int i = 0; i < points.length; i++) {
            myPoints[i] = new MyPoint(points[i][0], points[i][1]);
        }

        return getRectangle(myPoints);
    }

    public static MyRectangle2D getRectangle(MyPoint[] points) {
		double width = Math.abs(MyPoint.X - MyPoint.X);
        double height = Math.abs(MyPoint.Y - MyPoint.Y);

        return new MyRectangle2D(X, Y, width, height);
    }
    private double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }
    private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
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
