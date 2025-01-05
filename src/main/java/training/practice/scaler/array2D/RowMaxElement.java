package training.practice.scaler.array2D;

import java.util.Arrays;

/*Given a 2D array A of N rows and M columns, find value of largest element in each row.*/
public class RowMaxElement {

	//get max element from each row
	public static int[] getRowMaxElement(int[][] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) ;
				max = arr[i][j];
			}
			result[i] = max;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.toString(getRowMaxElement(arr)));
	}
}
