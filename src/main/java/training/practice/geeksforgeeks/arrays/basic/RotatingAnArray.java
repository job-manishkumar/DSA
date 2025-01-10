package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.*/
public class RotatingAnArray {

	//approach 1
	//tc -> O(n2) and sc -> O(1)
	public static void rotateArray(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
	}

	//approach 2
	//tc ->O(n) and sc ->O(1)
	public static void rotateArray_2(int[] arr, int d) {
		if (d > arr.length) {
			d = d % arr.length;
		}
		/*d = arr.length-d;//no of operation is increase
		reverse(arr,0,arr.length-1);*/
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	private static void reverse(int[] arr, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {-1, -2, -3, 4, 5, 6, 7};
		int d = 2;
		rotateArray(arr, d);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {-1, -2, -3, 4, 5, 6, 7};
		rotateArray_2(arr1, d);
		System.out.println(Arrays.toString(arr1));
	}
}
