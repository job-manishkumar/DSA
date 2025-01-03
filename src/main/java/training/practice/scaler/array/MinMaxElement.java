package training.practice.scaler.array;

import java.util.Arrays;
import java.util.Scanner;

/*Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only
line of the input would contain a single integer N that represents the length of the array followed by the N elements
 of the input array A.*/

public class MinMaxElement {

	//get min and max element from the array
	//tc -> O(n) and sc ->O(1)
	public static int[] getMinMaxElement(int[] arr) {
		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (minElement > arr[i]) {
				minElement = arr[i];
			}
			if (maxElement < arr[i]) {
				maxElement = arr[i];
			}
		}
		return new int[]{minElement, maxElement};
	}

	//get array elements from user
	public static int[] getUserInput() {
		System.out.println("enter input length for array");
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		System.out.println("enter the array elements..");
		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}

	//main function
	public static void main(String[] args) {
		int[] arr = getUserInput();// get input array from user
		int[] minMax = getMinMaxElement(arr);// get min and max element from the array.
		System.out.println(Arrays.toString(minMax));
	}

}
