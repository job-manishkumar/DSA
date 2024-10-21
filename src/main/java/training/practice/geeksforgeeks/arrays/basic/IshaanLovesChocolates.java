package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class IshaanLovesChocolates {

	//approach 1 --using sorting
	//tc -> O(nlogn) and sc -> O(1)
	public static int getChocolates(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	//approach 2 -- find smallest element
	//tc -> O(n) and sc -> O(1)
	public static int getChocolates_2(int[] arr) {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}


	public static void main(String[] args) {

		int[] arr = {5, 3, 1, 6, 9};
		System.out.println(getChocolates(arr));
		arr = new int[]{5, 3, 1, 6, 9};
		System.out.println(getChocolates_2(arr));

	}
}
