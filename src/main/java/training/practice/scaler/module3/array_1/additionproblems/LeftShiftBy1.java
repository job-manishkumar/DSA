package training.practice.scaler.module3.array_1.additionproblems;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShiftBy1 {

	public static int[] takeUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array Length.");
		int arrLength = scanner.nextInt();
		System.out.println("enter the array elements of length " + arrLength);
		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	//approach 1 - left shift by 1 using loop
	//tc -> O(n) and sc -> O(1)
	public static void leftShift(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}

	//approach 2 -- general solution
	//tc -> O(n) ans sc -> O(1)
	public static void leftShift_2(int[] arr) {
		int k = 1;
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, arr.length - k - 1);
		reverseArray(arr, arr.length - k, arr.length - 1);
	}

	public static void reverseArray(int[] arr, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] inputArray = takeUserInput();
		leftShift(inputArray);
		System.out.println(Arrays.toString(inputArray));

		int[] inputArray2 = takeUserInput();
		leftShift_2(inputArray2);
		System.out.println(Arrays.toString(inputArray2));
	}
}
