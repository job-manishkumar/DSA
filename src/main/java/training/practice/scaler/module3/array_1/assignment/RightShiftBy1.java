package training.practice.scaler.module3.array_1.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftBy1 {

	public static int[] takeUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array.");
		int arrLength = scanner.nextInt();
		System.out.println("enter the elements of array of length " + arrLength);
		int[] arr = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	//approach 1 -- simple right shift
	//tc -> O(n) and sc -> O(1)
	public static void rightShift(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
	}

	// approach 1 -- using general method
	//tc -> O(n) and sc -> O(1)
	public static void rightShift_2(int[] arr) {
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, 0);
		reverseArray(arr, 1, arr.length - 1);

	}

	public static void reverseArray(int[] arr, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] inputArray = takeUserInput();
		rightShift(inputArray);
		System.out.println(Arrays.toString(inputArray));

		int[] inputArray2 = takeUserInput();
		rightShift_2(inputArray2);
		System.out.println(Arrays.toString(inputArray2));


	}
}
