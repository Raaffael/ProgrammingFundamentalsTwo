
public class ArrayOperations2D {
	
	public static int getLowestInRow(int[][] twoDimAry, int row) {
		int lowestInt = 101;
		for(int j = 0; j < twoDimAry[row].length;j++) {
			if(lowestInt>=twoDimAry[row][j]) {
				lowestInt=twoDimAry[row][j];
			}
		}	
		return lowestInt;
	}
	
	public static int getHighestInRow(int[][] twoDimAry, int row) {
		int highestInt = 0;
		for(int j = 0; j < twoDimAry[row].length;j++) {
			if(highestInt<=twoDimAry[row][j]) {
				highestInt=twoDimAry[row][j];
			}
		}	
		return highestInt;
	}
	
	public static int getColumnTotal(int[][] twoDimAry, int column) {
		int total = 0;
		for(int j = 0; j < twoDimAry.length;j++) {
			total+=twoDimAry[j][column];
		}	
		return total;
	}
	
	public static int getRowTotal(int[][] twoDimAry, int row) {
		int total = 0;
		for(int j = 0; j < twoDimAry[row].length;j++) {
			total+=twoDimAry[row][j];
		}	
		return total;
	}

	public static int getTotal(int[][] twoDimAry) {
		int total = 0;
		for(int i = 0; i < twoDimAry.length; i++) {
			for(int j = 0; j < twoDimAry[i].length;j++) {
				total+=twoDimAry[i][j];
			}	
		}
		return total;
	}
	
	public static double getAverage(int[][] twoDimAry) {
		double total = 0;
		double lengthOfArray = 0;
		for(int i=0; i < twoDimAry.length; i++) {
			for(int j = 0; j < twoDimAry[i].length;j++) {
				total+=twoDimAry[i][j];
				lengthOfArray++;
			}	
		}
		return total/lengthOfArray;
	}

}
