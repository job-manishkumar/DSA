package training.practice.scaler.module3.array_1.assignment;

import java.util.Scanner;

public class MinMaxElement {

	public static void printMinMaxElement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array.");
		int arrayLength = scanner.nextInt();
		System.out.println("Enter the element of array of length " + arrayLength);
		int[] arr = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scanner.nextInt();
		}

		//get min and max element from array
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array size should be greater than 1 to get min and max element in " +
					"array");
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min element " + min + " and max element " + max + " in array");
	}

	public static void main(String[] args) {
		printMinMaxElement();
	}
}
