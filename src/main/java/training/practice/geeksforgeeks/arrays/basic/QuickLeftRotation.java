package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array, arr[] of positive elements, and an integer k, the task is to left-rotate the array k indexes.
Note: Rotate the array even if the k is greater than the size of the array. In these cases after every full array
rotation, the array comes the same as the original array.*/
public class QuickLeftRotation {

	// same question as Rotating an Array

	//approach 1 -- using loop
	//tc -> O(n*k) and sc -> O(1)
	public static void getLeftRotation(int[] arr, int k) {// time limit exceed
		for (int i = 0; i < k; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
	}

	//approach 2 -- reverse
	//tc -> O(n) and sc -> O(1)
	public static void getLeftRotation_2(int[] arr, int k) {
		if (k > arr.length) {
			k = k % arr.length;
		}
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int[] arr, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 2;
		getLeftRotation(arr, k);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		getLeftRotation_2(arr1, k);
		System.out.println(Arrays.toString(arr1));
	}
}
