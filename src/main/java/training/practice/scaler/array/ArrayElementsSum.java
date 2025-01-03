package training.practice.scaler.array;

import java.util.Scanner;

/*write a program to print sum of elements of the input array A of size N.
Note: User is supposed to write program from scratch to add the elements of the input array and print the result.*/
public class ArrayElementsSum {

	//get input array from user input
	public static int[] getInputArray() {
		System.out.println("enter the array length");
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		System.out.println("enter the array elements:");
		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}

	//get array elements sum
	//tc -> O(n) and sc ->(1)
	public static int getArraySum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

	//main function
	public static void main(String[] args) {
		int[] arr = getInputArray();//call input array function
		int sum = getArraySum(arr);// call get array sum function for calculating sum.
		System.out.println("sum: " + sum);
	}


}
