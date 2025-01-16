package training.practice.scaler.prefixsum;

import java.util.Arrays;

/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two
integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing*/
public class SumOfEvenIndices {

	//approach 1
	public static int[] evenIndicesSum(int[] arr, int[][] b) {
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0];
			int end = b[i][1];
			int sum = 0;
			for (int j = start; j <= end; j++) {
				if (j % 2 == 0) {
					sum += arr[j];
				}
			}
			result[i] = sum;
		}
		return result;
	}

	//approach 2
	public static int[] evenIndicesSum_2(int[] arr, int[][] b) {

		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = arr[i - 1];
			} else {
				arr[i] += arr[i - 1];
			}
		}
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0];
			int end = b[i][1];
			if (start == 0) {
				result[i] = arr[end];
			} else {
				result[i] = arr[end] - arr[start - 1];
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		int[][] b = {{0, 2}, {1, 4}};
		System.out.println(Arrays.toString(evenIndicesSum(arr, b)));
		System.out.println(Arrays.toString(evenIndicesSum_2(arr, b)));
	}
}
