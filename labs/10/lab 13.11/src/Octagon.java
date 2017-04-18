
public class Octagon extends GeometricObject implements Cloneable {
    double side;
    public Octagon() {
        this(5);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2.0 + 4.0 / Math.sqrt(2) * side * side);
    }

    public double getPerimeter() {
        return side * 8;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return o;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Octagon && getArea() == ((Octagon)o).getArea();
    }

	public int compareTo(Octagon oc2) {
		return 0;
	}
}
