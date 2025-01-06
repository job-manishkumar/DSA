package training.practice.scaler.array2D;

import java.util.ArrayList;
import java.util.List;

/*You are given a 2D Dynamic array A, return A 2D integer dynamic array containing row-wise unique element of A*/
public class RowWiseUniqueElement {

	public static List<List<Integer>> getRowWiseUniqueElement(int[][] arr) {

		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < arr[i].length; j++) {
				int count = 0;
				for (int k = 0; k < arr[i].length; k++) {
					if (arr[i][j] == arr[i][k]) {
						count++;
					}
				}
				if (count == 1) {
					list.add(arr[i][j]);
				}
			}
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 3, 3}, {6, 5, 6}, {7, 8, 9}, {10, 10, 10}};
		System.out.println(getRowWiseUniqueElement(arr));
	}
}
