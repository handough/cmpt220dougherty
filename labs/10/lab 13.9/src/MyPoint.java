
public class MyPoint {
	public static final double Y = 0;
	public static final double X = 0;
	int centerX, centerY, width, height;
	public MyPoint(double x2, double y2){
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

}