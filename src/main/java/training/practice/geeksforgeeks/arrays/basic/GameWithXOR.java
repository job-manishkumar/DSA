package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class GameWithXOR {

	//tc -> O(n) and sc -> O(1)
	public static void xorArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i] ^ arr[i + 1];
		}
	}

	public static void main(String[] args) {
		//int[] arr = {10, 11, 1, 2, 3};
		int[] arr = {5, 9, 7, 6};
		xorArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
