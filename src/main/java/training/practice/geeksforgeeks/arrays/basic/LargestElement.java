package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class LargestElement {

	//approach 1
	//TC -> O(nlogn) and SC -> O(1)
	public static int getLargest(int[] arr) {
		if (arr.length > 0) {
			Arrays.sort(arr);
			return arr[arr.length - 1];
		}
		return -1;
	}

	//approach 2
	//TC -> O(n) and SC ->O(1)
	public static int getLargest_2(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return arr.length > 0 ? largest : -1;
	}

	public static void main(String[] args) {

		int[] a = {1, 8, 7, 56, 90};
		System.out.println("get largest element in array is = " + getLargest(a));
		System.out.println("get largest element in array is = " + getLargest_2(a));


	}
}
