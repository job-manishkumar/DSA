package training.practice.scaler.prefixsum;

import java.util.Arrays;

/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two
integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing*/
public class SumOfOddIndices {

	//approach 1
	//tc -> O(n2) and sc -> O(n)
	public static int[] getOddIndicesSum(int[] arr, int[][] b) {
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			int sum = 0;
			for (int j = startIndex; j <= endIndex; j++) {
				if (j % 2 != 0) {
					sum += arr[j];
				}
			}
			result[i] = sum;
		}
		return result;
	}

	//approach 2
	public static int[] getOddIndicesSum_2(int[] arr, int[][] b) {
		//calculate prefix sum of odd indices
		arr[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] += arr[i - 1];
			} else {
				arr[i] = arr[i - 1];
			}
		}
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			if (startIndex == 0) {
				result[i] = arr[endIndex];
			} else {
				result[i] = arr[endIndex] - arr[startIndex - 1];
			}
		}
		return result;

	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[][] b = {{0, 2}, {1, 4}};
		System.out.println(Arrays.toString(getOddIndicesSum(arr, b)));
		System.out.println(Arrays.toString(getOddIndicesSum_2(arr, b)));
	}
}
