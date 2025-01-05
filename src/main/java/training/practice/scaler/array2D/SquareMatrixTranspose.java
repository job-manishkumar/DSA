package training.practice.scaler.array2D;

import java.util.Arrays;

/*Given a 2D integer array A, return the transpose of A. The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix’s row and column indices.*/
public class SquareMatrixTranspose {

	// approach 1  - convert rew to column and column to row
	//tc -> O(n2)  and sc -> O(n2)
	public static int[][] transpose(int[][] arr) {
		int[][] result = new int[arr[arr.length - 1].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result[j][i] = arr[i][j];
			}
		}
		return result;
	}

	// approach 2  -- using swapping
	//tc -> O(n2)  and sc -> O(1)
	public static int[][] transpose_2(int[][] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(Arrays.deepToString(transpose(arr)));
		System.out.println("=============");
		System.out.println(Arrays.deepToString(transpose_2(arr)));
	}
}
