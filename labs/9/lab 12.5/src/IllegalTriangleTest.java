
public class IllegalTriangleTest {
    public static void main(String[] args) {
        try {
            new TriangleException(1, 1, 2000);
        } 
        catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
