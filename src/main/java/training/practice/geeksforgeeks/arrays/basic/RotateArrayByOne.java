package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class RotateArrayByOne {

	//approach 1  shifting array element
	//tc -> O(n) and sc -> O(1)
	public static void getRotateArray(int[] arr) {

		int temp = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
	}

	// approach 2 general approach
	// tc -> O(n) and sc -> O(1)
	public static void getRotateArray_2(int[] arr) {

		int rotateTime = 1;
		//reverse whole array
		reverseArray(arr,0,arr.length-1);
		//reverse array form 0 to rotateTime-1;
		reverseArray(arr,0,rotateTime-1);
		//reverse array from rotateTime to arr.length-1;
		reverseArray(arr,rotateTime,arr.length-1);
	}

	public static void reverseArray(int[] arr, int startIndex, int endIndex) {
		for (int i = startIndex, j = endIndex; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}


	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
		getRotateArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("===============");

		arr = new int[]{9, 8, 7, 6, 4, 2, 1, 3};
		getRotateArray_2(arr);
		System.out.println(Arrays.toString(arr));

	}
}
