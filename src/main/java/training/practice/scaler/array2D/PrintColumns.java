package training.practice.scaler.array2D;

/*Given a matrix of N rows and M columns, print it column by column. First print 0th column, then 1st column, 2nd column and so on.*/
public class PrintColumns {

	//print column data
	//tc -> O(n2) and sc -> O(1)
	//if we know row and col value
	public static void printColumnData(int[][] arr, int row, int col) {

		for (int j = 0; j < col; j++) {
			for (int i = 0; i < row; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	//if we don't know the row and col value
	public static void printColumnData(int[][] arr) {

		for (int j = 0; j < arr[arr.length-1].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		//int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		int row = arr.length;
		int col = arr[row - 1].length;
		printColumnData(arr, row, col);
		System.out.println("==============");
		printColumnData(arr);
	}
}
