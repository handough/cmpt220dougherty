
public class Circle2D  extends GeometricObject {

    private double x;
    private double y;
    private double radius;
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D() {
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {

        return 2 * radius * Math.PI;

    }

    public boolean contains(Circle2D circle2D) {
        return false;
    }

    public static boolean c1ContainsC2(Circle2D c1, Circle2D c2) {
        Circle2D cir1 = new Circle2D();
        Circle2D cir2 =new Circle2D();

        return cir1.contains(cir2);
    }

    @Override
    public String toString() {
        return "Circle2D{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}