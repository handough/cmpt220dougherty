
public class Location {
	double [][] a = new double[0][0];
	int row;
	int column;
	double maxValue;
	
	public Location(int row, int column, double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public int getRow(int newRow){
		row = newRow;
		return row;
	}
	
	public int getColumn(int newColumn){
		column = newColumn;
		return column;
	}
	
	public double getMaxValue(int newMaxValue){
		maxValue = a[row][column];
		return maxValue;
	}
	
	public static Location locateLargest(double [][] a, int row, int column){
        row = 0;
        column = 0;
        double maxValue = a[row][column];
		
        for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[i].length; j++){
                        if (a[i][j] > maxValue){
                                row = i;
                                column = j;
                                maxValue = a[i][j];
                        }
                }
        }
        return new Location(row, column, maxValue);
	}
}
