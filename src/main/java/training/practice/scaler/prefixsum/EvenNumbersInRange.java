package training.practice.scaler.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
 * Each query consists of two integers B[i][0] and B[i][1].
 * For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].*/
public class EvenNumbersInRange {

	/*
	 * approach 1
	 * tc -> O(n2) and sc -> O(n)
	 * */
	public static int[] getEvenNumbers(int[] arr, int[][] b) {
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0];
			int end = b[i][1];
			int count = 0;
			for (int j = start; j <= end; j++) {
				if (arr[j] % 2 == 0) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	//*approach 2
	//* tc -> O(n) and sc -> O(n)
	public static int[] getEvenNumbers_2(int[] arr, int[][] b) {
		int[] result = new int[b.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		//* make prefix array for even count
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}

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
		int[][] b = {{0, 2}, {2, 4}, {1, 4}};
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(getEvenNumbers(arr, b)));
		System.out.println(Arrays.toString(getEvenNumbers_2(arr1, b)));
	}
}
