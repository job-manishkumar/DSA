package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class MaxAndMinProduct {

	//approach 1 - using sorting
	//tc -> O(nlogn) and sc -> (1)
	public static long getProduct(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (long) arr1[arr1.length - 1] * arr2[0];
	}

	// approach 2
	// tc -> O(n) and sc(1)
	public static long getProduct_2(int[] arr1, int[] arr2) {
		int maxValue = getMax(arr1);
		int minValue = getMin(arr2);
		return (long) maxValue * minValue;
	}

	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int getMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr1 = {5, 7, 9, 3, 6, 2};
		int[] arr2 = {1, 2, 6, 1, 9};

		System.out.println(getProduct(arr1, arr2));

		System.out.println(getProduct_2(arr1, arr2));
	}
}
