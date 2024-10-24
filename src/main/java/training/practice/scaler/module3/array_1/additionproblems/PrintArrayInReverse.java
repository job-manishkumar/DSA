package training.practice.scaler.module3.array_1.additionproblems;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInReverse {

	//taking input from user
	public static int[] takeUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter length of array");
		int arrLength = scanner.nextInt();
		System.out.println("enter the elements of array of length " + arrLength);
		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	//approach 1 using for loop and extra array
	// tc -> O(n) and sc -> O(n)
	public static void printReverseOrder(int[] arr) {
		int[] reverseArray = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseArray[arr.length - 1 - i] = arr[i];
		}
		System.out.println(Arrays.toString(reverseArray));
	}

	//approach 2  - without extra array
	//tc -> O(n) and sc -> O(1)
	public static void printReverseOrder_2(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] inputArray = takeUserInput();
		printReverseOrder(inputArray);
		printReverseOrder_2(inputArray);

	}
}
