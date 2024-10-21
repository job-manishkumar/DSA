package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class RotatingAnArray {

	//approach1 - brute force
	//tc -> O(n2) and sc->O(1)
	public static void rotateArray(int[] arr, int d) {

		if (d > arr.length) {
			d = d % arr.length;
		}
		int rotateTime = arr.length - d;
		for (int i = 0; i < rotateTime; i++) {
			//shift the array
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = temp;
		}
	}

	//approach 2
	//tc -> O(n) and sc->O(1)
	public static void RotateArray(int[] arr, int d) {

		if (d > arr.length) {
			d = d % arr.length;
		}
		int rotateTime = arr.length - d;

		//rotate array
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, rotateTime - 1);
		reverseArray(arr, rotateTime, arr.length - 1);
	}

	public static void reverseArray(int[] arr, int startIndex, int endIndex) {
		for (int i = startIndex, j = endIndex; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		//int[] arr = {-1, -2, -3, 4, 5, 6, 7};
		//int d = 2;
		int[] arr = {1, 3, 4, 2};
		int d = 3;
		rotateArray(arr, d);
		System.out.println(Arrays.toString(arr));

		int[] arr2 = {-1, -2, -3, 4, 5, 6, 7};
		int d2 = 2;
		rotateArray(arr2, d2);
		System.out.println(Arrays.toString(arr2));

	}
}
