import java.util.Arrays;

public class a3main {

	public static void main(String[] args) {
		int[][] twoDimAry = {{40,90,58,23},{9,29,35,12},{11,2,41,72},{49,94,55,33}};
		showArray(twoDimAry);
		showResults(twoDimAry);
	}
	
	public static void showArray(int[][] twoDimAry) {
		System.out.println("The array being tested is:");
		System.out.println(Arrays.toString(twoDimAry[0]));
		System.out.println(Arrays.toString(twoDimAry[1]));
		System.out.println(Arrays.toString(twoDimAry[2]));
		System.out.println(Arrays.toString(twoDimAry[3]));
		System.out.println("Rows and Columns numbered 1-4.");
	}
	
	public static void showResults(int[][] twoDimAry) {
		System.out.println("The getTotal method returns: " + ArrayOperations2D.getTotal(twoDimAry));
		System.out.println("The getAverage method returns: " + ArrayOperations2D.getAverage(twoDimAry));
		System.out.println("The getRowTotal method returns: " + ArrayOperations2D.getRowTotal(twoDimAry, 1) + " (Row tested: 2)");
		System.out.println("The getColumnTotal method returns: " + ArrayOperations2D.getColumnTotal(twoDimAry, 0) + " (Column tested: 1)");
		System.out.println("The getHighestInRow method returns: " + ArrayOperations2D.getHighestInRow(twoDimAry, 3) + " (Row tested: 4)");
		System.out.println("The getLowestInRow method returns: " + ArrayOperations2D.getLowestInRow(twoDimAry, 2) + " (Row tested: 3)");
	}

}
