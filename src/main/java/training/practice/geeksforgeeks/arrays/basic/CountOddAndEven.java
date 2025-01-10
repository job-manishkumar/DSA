package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements
in the array.

Note: Return two elements where the first one in the count of odd & second one is the count of even.*/
public class CountOddAndEven {

	//tc -> O(n) and sc ->O(1)
	public static int[] countEvenOdd(int[] arr) {
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		return new int[]{countOdd, countEven};
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(countEvenOdd(arr)));
	}
}
