package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class MinMaxArray {

	//approach 1
	//tc -> O(n) and sc -> O(1)
	public static int[] getMinMax(int[] arr) {

		int[] ans = new int[2];
		if (arr.length < 1) {
			throw new IllegalArgumentException("Array size should be greater than zero for get min max element in " +
					"array");
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		ans[0] = min;
		ans[1] = max;
		return ans;
	}

	//approach 2 - using sorting
	//tc -> O(nlogn) and sc -> O(1)
	public static int[] getMinMax_2(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array length should be greater than zero for getting min and max " +
					"element");
		}
		int[] ans = new int[2];
		Arrays.sort(arr);
		ans[0] = arr[0];
		ans[1] = arr[arr.length - 1];
		return ans;
	}


	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 56, 10000, 167};

		/*
		 	int[] arr = {1, 345, 234, 21, 56789};
		 int[] arr = {56789};
		 int[] arr = {};
		*/
		System.out.println(Arrays.toString(getMinMax(arr)));
		System.out.println(Arrays.toString(getMinMax_2(arr)));

	}
}

