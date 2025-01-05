package training.practice.scaler.array2D;

/*Given an N * N matrix, print the elements of the matrix in a wave form row-wise. for the first row, traverse from left to right, for 2nd row, traverse right to left, and continue this alternating pattern for the remaining rows.*/
public class PrintWaveForm {

	//print wave form
	//tc -> O(n2) and sc ->O(1)
	public static void printWaveForm(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		printWaveForm(arr);
	}
}
