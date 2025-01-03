package training.practice.scaler.array;

import java.util.Arrays;

/*Write a program that reads an integer array A from input and modifies the array by shifting each element to the
right by one position and by shifting the last element to the first position. After performing the shifting
operation, print the modified array.*/
public class ShiftElementToRight {

	//shifting element to right and put last element to first index in array
	//tc -> O(n) and sc ->(1)
	public static int[] rightShift(int[] arr) {

		int temp = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(rightShift(arr)));
	}
}
