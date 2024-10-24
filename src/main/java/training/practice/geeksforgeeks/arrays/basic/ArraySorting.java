package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class ArraySorting {

	//approach 1  using sorting
	//tc -> O(nlogn) and sc O(1)
	public static int[] binaryArraySorting(int[] arr){// time limit exceed
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {

		int[] a = {1, 0, 1, 1, 0};
		System.out.println(Arrays.toString(binaryArraySorting(a)));
	}
}
