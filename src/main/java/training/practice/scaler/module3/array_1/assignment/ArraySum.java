package training.practice.scaler.module3.array_1.assignment;

import java.util.Scanner;

public class ArraySum {

	// tc -> O(n) and sc (n)
	public static int getSum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array..");
		int arrayLength = scanner.nextInt();
		int[] arr = new int[arrayLength];
		System.out.println("enter the element of array of length " + arrayLength);
		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getSum());
	}
}
