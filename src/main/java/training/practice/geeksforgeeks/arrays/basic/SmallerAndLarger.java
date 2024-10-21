package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class SmallerAndLarger {

	//approach 1- brute force
	//tc -> O(n) and sc -> O(1)
	public static int[] getMoreAndLess(int[] arr, int x) {

		int lessCount = 0;
		int greaterCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (x >= arr[i]) {
				lessCount++;
			}
			if (x <= arr[i]) {
				greaterCount++;
			}
		}
		return new int[]{lessCount, greaterCount};
	}

	// approach 2 - using binary search because array is sorted
	//need to check
	public static int[] getMoreAndLess_2(int[] arr, int x) {
		int lessCount = 0;
		int greaterCount = 0;
		int lowIndex = 0;
		int highIndex = arr.length - 1;

		while (lowIndex <= highIndex) {
			int mid = lowIndex + ((highIndex - lowIndex) / 2);
			if (arr[mid] <= x) {
				lessCount += mid - lowIndex + 1;
				lowIndex = mid + 1;
			}
			if (arr[mid] >= x) {
				greaterCount += highIndex - mid + 1;
				highIndex = mid - 1;
			}
		}
		return new int[]{lessCount, greaterCount};
	}


	public static void main(String[] args) {
		//int[] a = {1, 2, 8, 10, 11, 12, 19};
		//int x = 0;
		int[] a = {1, 5, 8, 12, 12, 12, 19};
		int x = 12;
		System.out.println(Arrays.toString(getMoreAndLess(a, x)));
		System.out.println(Arrays.toString(getMoreAndLess_2(a, x)));
	}
}
