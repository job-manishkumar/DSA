package training.practice.scaler.array2D;

/*Given a matrix of N rows and M columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.*/
public class PrintRows {

	//print row wise data
	//tc -> O(n2) and sc -> O(1)
	//way 1
	public static void printRowData(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		printRowData(arr);
	}
}
