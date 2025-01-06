package training.practice.scaler.array;

import java.util.ArrayList;
import java.util.List;

/*given 2 arrays of integer A and B, return a 2D array of integers such that ith row of the array contains list of values in A such that A[j]%B[i] ==0 in A in sequential order.*/
public class GetDivisibilityOfArrays {

	public static List<List<Integer>> getDivisibilityArray(int[] a, int[] b) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < a.length; j++) {
				if (a[j] % b[i] == 0) {
					list.add(a[j]);
				}
			}
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {2, 5, 9, 3, 8};
		int[] b = {3, 2};
		System.out.println((getDivisibilityArray(a, b)));
	}
}
