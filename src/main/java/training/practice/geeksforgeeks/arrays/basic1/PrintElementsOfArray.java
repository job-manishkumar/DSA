package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given an array arr, print all its elements space-separated.

Note: You don't need to move to the next line after printing all elements of the array (space-separated)*/
public class PrintElementsOfArray {

	//using for loop
	public static void printArrayElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// in java 8
	public static void printArrayElement_2(int[] arr) {
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		printArrayElement(arr);
		printArrayElement_2(arr);
	}
}
