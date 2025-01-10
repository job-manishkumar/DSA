package training.practice.geeksforgeeks.arrays.basic;

import java.sql.SQLOutput;
import java.util.Arrays;

/*Given an array arr, write a program segregating even and odd numbers. The program should put all even numbers first
 in sorted order, and then odd numbers in sorted order.

Note:- You don't have to return the array, you have to modify it in-place.*/
public class SegregateEvenAndOddNumbers {

	//tc -> (nlogn) and sc -> O(1)
	public static void segregateNumber(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] % 2 == 0) {
				i++;
			} else if (arr[j] % 2 != 0) {
				j--;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		Arrays.sort(arr, 0, j + 1);
		Arrays.sort(arr, i, arr.length);

	}

	public static void main(String[] args) {
		int[] arr = {20, 13, 20, 11, 11, 16, 18, 15, 15, 12, 14, 16, 16, 15, 16, 15, 10, 11, 14};
		segregateNumber(arr);
		System.out.println("result - " + Arrays.toString(arr));
	}
}
