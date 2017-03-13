
public class MyInteger {
	int value;
	
	public MyInteger(int value){
		this.value = value;
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
		 if(value % 2 != 0){
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
}

