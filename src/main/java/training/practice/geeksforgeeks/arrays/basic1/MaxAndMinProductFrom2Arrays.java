package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array
arr1, and minimum element of the second array arr2.*/
public class MaxAndMinProductFrom2Arrays {

	//approach 1
	//tc -> O(nlogn) and sc -> O(1)
	public static long findMinMaxMultiply(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (long) arr1[arr1.length - 1] * arr2[0];
	}

	//approach 2
	//tc -> O(n+m) and sc -> O(1)
	public static long findMinMaxMultiply_2(int[] arr1, int[] arr2) {
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		//get max from 1 arr
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		//get min value from arr2
		for (int i = 0; i < arr2.length; i++) {
			if (min > arr2[i]) {
				min = arr2[i];
			}
		}
		return max * min;
	}

	public static void main(String[] args) {
		int[] arr1 = {5, 7, 9, 3, 6, 2};
		int[] arr2 = {1, 2, 6, 1, 9};
		System.out.println(findMinMaxMultiply(arr1, arr2));
		System.out.println(findMinMaxMultiply_2(arr1, arr2));
	}
}
