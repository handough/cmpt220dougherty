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
// JA		LinearEquation le = new LinearEquation(0, 0, 0, 0, 0, 0);

		LinearEquation le = new LinearEquation(aa, bb, cc, dd, ee, ff);
		
		//getting a-f
/*		le.getA(aa);
		le.getB(bb);
		le.getC(cc);
		le.getD(dd);
		le.getE(ee);
		le.getF(ff);
		
		double xx = ((ee * dd) - (bb * ff)) / ((aa * dd) - (bb * cc)); 
		double yy = ((aa * ff) - (ee * cc)) / ((aa * dd) - (bb * cc)); */
		
		le.getX();
		le.getY();
		
		//testing if equation is solvable
		if(le.isSolvable() == true){
			System.out.println("The equation has no solution!");
		}
		else{
			//printing x
			System.out.println("X is: " + le.getX()); // JA
			//printing y
			System.out.println("Y is: " + le.getY()); // JA
		}
		
		//closing scanner
		scanner.close();
	}
}
