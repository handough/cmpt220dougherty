import java.util.Random;
public class largestRowAndColumn {
	public static void main(String[] args){
		Random rand = new Random();
		
		int[][] m = new int[3][3];
		
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rand.nextInt(2);
            }
        }
		
	    for (int i = 0; i < m.length; i++) {
            for (int j = 0;j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
	    
	    System.out.println("The largest row is at index: " + computeRow(m));
        System.out.println("The largest column is at index: " + computeColumn(m));
	}
	public static int computeRow(int[][] m) {
	     int[] count = new int[m.length];
	     int sum = 0;
	     for (int i = 0; i < 3; i++) {
	    	 for (int j = 0; j < 3; j++) {
	    		 sum += m[i][j];
	    	}
	    	 count[i] = sum;
	    }
	     int highestIndex = 0;
	     
	     for (int i = 1; i < count.length; i++) {
	    	 if (count[i] > count[highestIndex]) {
	    		 highestIndex = i;
	    	}
	    }
	    return highestIndex;
	}
	public static int computeColumn(int[][] m) {

        int[] count = new int[m.length];

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + m[j][i];
            }
            count[i] = sum;
        }

        int highestIndex = 0;

        for (int i = 0; i < i + 1; i++) {
            for (int j = count.length - 1; j >= i; j--) {
                if (count[i] < count[j]) {
                    highestIndex = j;
                    break;
                }
            }
        }
        return highestIndex;
    }

}
