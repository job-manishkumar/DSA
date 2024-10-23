package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class MaximumProduct {

	//approach 1 - brute force
	//tc -> O(n2) and sc ->O(1)
	public static int getMaxProduct(int[] arr) {// time limit exceed

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int product = 0;
			for (int j = i + 1; j < arr.length; j++) {
				product = arr[i] * arr[j];
				if (product > max) {
					max = product;
				}
			}
		}
		return max;
	}

	//approach 2 -- using sorting
	//tc -> O(nlogn) and sc -> O(1)
	public static int getMaxProduct_2(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1] + " : " + arr[arr.length - 2]);
		return arr[arr.length - 1] * arr[arr.length - 2];
	}

	//approach 3 -- using getting largest and second-largest value of array
	//tc -> O(n) and sc ->(1)
	public static int getMaxProduct_3(int[] arr) {

		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			} else if (arr[i] > secondLarge) {
				secondLarge = arr[i];
			}
		}
		System.out.println(large + " : " + secondLarge);
		return large * secondLarge;
	}

	public static void main(String[] args) {

		//int[] arr = {1, 4, 3, 6, 7, 0};
		//int[] arr = {1, 100, 42, 4, 23};
		int[] arr = {12, 87, 86, 27, 87, 88, 81, 88, 68, 52, 67, 88, 83, 38, 32, 54, 65, 75, 71, 39};
		System.out.println(getMaxProduct(arr));
		System.out.println(getMaxProduct_2(arr));
		System.out.println(getMaxProduct_3(arr));
	}
}
