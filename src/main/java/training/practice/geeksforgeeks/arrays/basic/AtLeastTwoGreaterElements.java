package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class AtLeastTwoGreaterElements {

	//approach 1 -- using sorting
	// tc -> O(nlogn) and sc -> O(n)
	public static long[] findElementArray(long[] arr) {
		Arrays.sort(arr);
		long[] result = new long[arr.length - 2];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[i];
		}
		return result;
	}

	//approach 2
	// tc -> o(n) and sc -> (n)
	public static long[] findElementArray_2(long[] arr) {

		//find large and second large element in array
		long large = Integer.MIN_VALUE;
		long secondLarge = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			}
			if (arr[i] > secondLarge && arr[i] != large) {
				secondLarge = arr[i];
			}
		}

		long[] result = new long[arr.length - 2];
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (arr[j] != large && arr[j] != secondLarge) {
				result[i] = arr[j];
				i++;
				j++;
			} else {
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		long[] a = {2, 8, 7, 1, 5};
		System.out.println(Arrays.toString(findElementArray(a)));
		a = new long[]{2, 8, 7, 1, 5};
		System.out.println(Arrays.toString(findElementArray_2(a)));
	}
}
