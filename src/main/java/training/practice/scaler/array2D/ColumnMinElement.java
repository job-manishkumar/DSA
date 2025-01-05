package training.practice.scaler.array2D;

import java.util.ArrayList;
import java.util.List;

/*Given a 2D array A[][]. Find the value of the smallest element in each column and return it in an array.*/
public class ColumnMinElement {

	public static List<Integer> getMinElement(int[][] arr) {

		List<Integer> list = new ArrayList<>();
		for (int j = 0; j < arr[arr.length - 1].length; j++) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
			list.add(min);
		}
		return list;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 134}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(getMinElement(arr));
	}
}
