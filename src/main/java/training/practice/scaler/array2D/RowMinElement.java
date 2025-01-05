package training.practice.scaler.array2D;

import java.util.Arrays;

/*Given a 2D array A[][], find the value of the smallest element in each row and return it in an array.*/
public class RowMinElement {

	//get row wise min element
	public static int[] getRowMinElement(int[][] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
			result[i] = min;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.toString(getRowMinElement(arr)));
	}
}
