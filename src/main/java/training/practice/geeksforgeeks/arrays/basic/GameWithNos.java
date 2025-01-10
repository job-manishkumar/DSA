package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*You are given an array arr[], and you have to re-construct an array arr[].
The values in arr[] are obtained by doing Xor of consecutive elements in the array.*/
public class GameWithNos {

	//tc ->O(n) and sc-> O(1)
	public static int[] xorOperation(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i] ^ arr[i + 1];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {10, 11, 1, 2, 3};
		System.out.println(Arrays.toString(xorOperation(arr)));
	}
}
