package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return
false.*/
public class PalindromicArray {

	//tc ->O(n*logn) and sc-> O(n)
	public static boolean isPalindromicArray(int[] arr) {
		boolean[] result = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (arr[i] != checkPalindrome(number)) {
				return false;
			}
		}
		return true;
	}


	// tc -> O(logn) and sc -> O(1)
	private static int checkPalindrome(int number) {
		int newNumber = 0;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			newNumber = newNumber * 10 + remainder;
		}
		return newNumber;
	}

	public static void main(String[] args) {
		int[] arr = {111, 222, 333, 444, 555};
		System.out.println(isPalindromicArray(arr));
	}
}
