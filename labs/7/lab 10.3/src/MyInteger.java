
public class MyInteger {
	int value;
	
	public MyInteger(int newValue){
		this.value = newValue;
	}
	 public int getValue(){
		 return value;
	 }
	 public boolean isEven(){
		 if(value % 2 == 0){
			 return true;
		 }
		 return false;
	 }
	 public boolean isOdd(){
		 if(isEven() == false){
			 return true;
		 }
		 return false;
	 }
	 public boolean isPrime(){
		 int factor = 0;
		 for(factor = 2; factor <= value / 2; factor++){
			 if(value / factor != 0){
				 return true;
			 }
		 }
		 return false;
	 }
	 public static boolean isEven(MyInteger n){
		 return n.isEven();
	 }
	 public static boolean isOdd(MyInteger n){
		 return n.isOdd();
	 }
	 public static boolean isPrime(MyInteger n){
		 return n.isPrime();
	 }
	 public boolean isEven(int value){
		 return isEven(value);
	 }
	 public boolean isOdd(int value){
		 return isOdd(value);
	 }
	 public boolean isPrime(int value){
		 return isPrime(value);
	 }
	 public boolean equals(int n){
		 return value == n;
	 }
	 public boolean equals(MyInteger n){
		 return equals(n.getValue());
	 }
	 public static int parseInt(String s){
		 return Integer.parseInt(s);
	 }
	 public static int parseInt(char [] s){
		 return parseInt(new String(s));
	 }
}

