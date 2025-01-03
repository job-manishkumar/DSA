package training.practice.scaler.array;

import java.util.Arrays;
import java.util.Scanner;

/*Write a program that reads an integer array Arr[] form input and modifies that array by shifting each element to
the left by one position and by shifting the first element to the last position. Print the modified array*/
public class ShiftElementToLeft {


	//get user input for array
	public static int[] getUserInput() {
		System.out.println("enter array length");
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		System.out.println("enter elements of array");
		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	//get left shift of element
	//tc -> O(n) and sc- >(1)
	public static int[] getLeftShift(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}


	public static void main(String[] args) {
		int[] arr = getUserInput();
		System.out.println(Arrays.toString(getLeftShift(arr)));
	}
}
