import java.util.Scanner;
public class computingGCD {
	public static void main(String[] args){
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[5];
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter a number: ");
		    int number = input.nextInt();
		    list[i] = number;
		}
		
	    if(list[0] + list[1] == 0){
	    	System.out.println("GCD: 0");
	    }
	    else{
	    	int g = list[0]%list[1]%list[2]%list[3]%list[4];
		    System.out.println(g);
	    }
	    //closing scanner
	    input.close();
	}
}
