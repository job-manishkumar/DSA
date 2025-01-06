package training.practice.scaler.array2D;

import java.util.Arrays;

/*You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.*/
public class RowColumnSum {

	public static int[] getRowColumnSum(int[][] arr) {
		int[] result = new int[arr.length + arr[arr.length - 1].length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			result[k] = rowSum;
			k++;
		}

		for (int j = 0; j < arr[arr.length - 1].length; j++) {
			int colSum = 0;
			for (int i = 0; i < arr.length; i++) {
				colSum += arr[i][j];
			}
			result[k] = colSum;
			k++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2}, {4, 5}, {8, 9}};
		System.out.println(Arrays.toString(getRowColumnSum(arr)));
	}
}
