package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class BinaryArraySorting {

	//approach 1 using sorting
	public static void binarySorting(int[] arr) {
		Arrays.sort(arr);

	}

	public static void main(String[] args) {
		int[] a = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
		binarySorting(a);
		System.out.println(Arrays.toString(a));

	}
}
