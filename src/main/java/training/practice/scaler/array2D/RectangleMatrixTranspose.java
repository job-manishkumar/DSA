package training.practice.scaler.array2D;

import java.util.Arrays;

/*Given a 2D integer array A, return the transpose of A. The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix’s row and column indices.*/

public class RectangleMatrixTranspose {

	// convert row to column and column to row
	public static int[][] convertToColumnData(int[][] arr) {
		int[][] result = new int[arr[arr.length - 1].length][arr.length];
		for (int j = 0; j < arr[arr.length - 1].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				result[j][i] = arr[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println("original array\n" + Arrays.deepToString(convertToColumnData(arr)));

	}

}
