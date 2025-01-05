package training.practice.scaler.array2D;

import java.util.ArrayList;
import java.util.List;

/*You are given a 2D integer matrix A, and return 2D dynamic array containing odd numbers of every row in A.*/
public class RowOddNumbers {

	public static List<List<Integer>> getOddNumbers(int[][] arr) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					temp.add(arr[i][j]);
				}
			}
			result.add(temp);
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(getOddNumbers(arr));
	}
}
