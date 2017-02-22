import java.util.Scanner;
public class computeDeviation {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        int[] list = new int[10];
        
        double sum = 0;
        double mean = 0;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter a number: ");
			list[i] = input.nextInt();
		}
		
		double [] temp = new double[10]; 
		for (int i=0; i < 10; i++) 
		{ 
			temp[i] = Math.pow((list[i] - mean), 2);  
	    	sum += temp[i];  
	    }
	      
	    mean = sum / 10;
	    double deviation = Math.sqrt(mean); 
	    System.out.println("Mean: "+ mean); 
	    System.out.println("Deviation: " + deviation);
	      
	    //closing scanner
	    input.close();
	}	
}
