public class TestComparable {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(0, 0, 5);
        Circle2D c2 = new Circle2D(0, 0, 2);
        Circle2D maxCircle =(Circle2D)GeometricObject.max(c1, c2);
        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
        System.out.println("Max circle is: " + maxCircle);

        Rectangle2D r1 = new Rectangle2D(0, 0, 10, 5);
        Rectangle2D r2 = new Rectangle2D(0, 0, 10, 10);
        Rectangle2D maxRectangle = (Rectangle2D) GeometricObject.max(r1, r2);
        System.out.println("MyRec2 1: " + r1);
        System.out.println("MyRec2 2: " + r2);
        System.out.println("Max MyRec2 is: " + maxRectangle);


    }


}
