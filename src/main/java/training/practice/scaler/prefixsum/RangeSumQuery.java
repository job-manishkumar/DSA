package training.practice.scaler.prefixsum;

import java.util.Arrays;

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
public class RangeSumQuery {

	/*
	 * approach 1
	 * tc -> O(n2) and sc -> O(n)**/
	public static int[] rangeSum(int[] arr, int[][] b) {
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int start = b[i][0];
			int end = b[i][1];
			int sum = 0;
			for (int j = start; j <= end; j++) {
				sum += arr[j];
			}
			result[i] = sum;
		}
		return result;
	}

	/*
	 * approach 2
	 * tc -=> O(n) and sc -> O(n)*/
	public static int[] rangeSum_2(int[] arr, int[][] b) {
		//* calculate prefix sum
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
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
		int[][] b = {{0, 3}, {1, 2}};
		System.out.println(Arrays.toString(rangeSum(arr, b)));
		System.out.println(Arrays.toString(rangeSum_2(arr,b)));
	}

}
