import java.util.Scanner;
public class testLinearEquation {
	public static void main(String[] args){
		//creating scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int aa = scanner.nextInt();
		System.out.println("Enter b: ");
		int bb = scanner.nextInt();
		System.out.println("Enter c: ");
		int cc = scanner.nextInt();
		System.out.println("Enter d: ");
		int dd = scanner.nextInt();
		System.out.println("Enter e: ");
		int ee = scanner.nextInt();
		System.out.println("Enter f: ");
		int ff = scanner.nextInt();
		
		//creating linear equation
		LinearEquation le = new LinearEquation(0, 0, 0, 0, 0, 0);
		
		//getting a-f
		le.getA(aa);
		le.getB(bb);
		le.getC(cc);
		le.getD(dd);
		le.getE(ee);
		le.getF(ff);
		
		int xx = ((ee * dd) - (bb * ff) / (aa * dd) - (bb * cc));
		int yy = ((aa * ff) - (ee * cc) / (aa * dd) - (bb * cc));
		
		le.getX(xx);
		le.getY(yy);
		
		//testing if equation is solvable
		if(le.isSolvable() == true){
			System.out.println("The equation has no solution!");
		}
		else{
			//printing x
			System.out.println("X is: " + xx);
			//printing y
			System.out.println("Y is: " + yy);
		}
		
		//closing scanner
		scanner.close();
	}
}
