
public class pentagonalNumbers {
	public static void main (String[] args) {
		System.out.println("Pentagonal numbers: ");
		getPentagonalNumber(100);
	}
	public static int getPentagonalNumber(int n) {
			int pentN;
			int number = 1;
			
			while (number <= 100) {
				pentN = number * (3 * number - 1) / 2;
				if (number % 10 == 0) {
					System.out.println(pentN);
				}
				else {
					System.out.print(pentN + ", ");
				}
				number++;
			}
			return number;
		}
}
