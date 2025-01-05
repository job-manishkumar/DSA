package training.practice.scaler.array2D;

import java.util.ArrayList;
import java.util.List;

/*You are given a 2D integer matrix A, return a 2D dynamic array containing even numbers of every row in A.*/
public class RowEvenNumber {

	public static List<List<Integer>> getRowEvenNumber(int[][] arr) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> rowEvenNumber = new ArrayList<>();
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					rowEvenNumber.add(arr[i][j]);
				}
			}
			result.add(rowEvenNumber);
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(getRowEvenNumber(arr));
	}
}
