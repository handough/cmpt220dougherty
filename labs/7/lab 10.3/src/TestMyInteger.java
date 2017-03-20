
public class TestMyInteger {
	public static void main(String[] args){
		MyInteger int1 = new MyInteger(5);
		
		System.out.println("Is the first number even: " + int1.isEven());
		System.out.println("Is the first number odd: " + int1.isOdd());
		System.out.println("Is the first number prime: " + int1.isPrime());
		//System.out.println("Is 9 prime: " + MyInteger.isPrime(9));
		System.out.println();
		
		MyInteger int2 = new MyInteger(6);
		
		System.out.println("Is the second number even: " + int2.isEven());
		System.out.println("Is the second number odd: " + int2.isOdd());
		System.out.println("Is the second number prime: " + int2.isPrime());
		System.out.println();
		
		System.out.println("It is " + int1.equals(int2) + " that int1 equals int2.");
		System.out.println();
		
		char[] chars = {'1', '2', '3', '4'};
		System.out.println("The array chars converted to a int: " + MyInteger.parseInt(chars));
		
		String s = "1234";
		System.out.println("The string converted to an int: " + MyInteger.parseInt(s));
		
		
	}
}
