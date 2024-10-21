package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class QuickLeftRotation {


	//approach 1- brute force
	//tc -> O(n2) and sc -> O(1)
	public static void leftRotate(int[] arr, int k) {

		if (k > arr.length) {
			k = k % arr.length;
		}
		for (int i = 0; i < k; i++) {
			//shift the array element to left
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
	}

	//approach 2 -  better but with clockwise rotation
	//tc - > O(n) and sc -> O(1)
	public static void rightRotate(int[] arr, int k) {

		if (k > arr.length) {
			k = k % arr.length;
		}
		int rightRotateTime = arr.length - k;

		//rotate the array

		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, rightRotateTime - 1);
		reverseArray(arr, rightRotateTime, arr.length - 1);

	}

	public static void reverseArray(int[] arr, int startIndex, int endIndex) {

		for (int i = startIndex, j = endIndex; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// approach 3 - with left rotation only
	//tc - > O(n) and sc -> O(1)
	public static void leftRotationByK(int[] arr, int k) {

		if (k > arr.length) {
			k = k % arr.length;
		}
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, arr.length - k - 1);
		reverseArray(arr, arr.length - k, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int k = 2;

		leftRotate(a, k); // limit limit exceed
		System.out.println(Arrays.toString(a));
		System.out.println("=========");
		a = new int[]{1, 2, 3, 4, 5, 6, 7};
		rightRotate(a, k);
		System.out.println(Arrays.toString(a));
		System.out.println("=========");
		a = new int[]{1, 2, 3, 4, 5, 6, 7};
		leftRotationByK(a, k);
		System.out.println(Arrays.toString(a));

	}
}
