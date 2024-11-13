package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Java1DAnd2DArray {

	//approach 1 only for 2D array
	// tc -> O(n2) and sc -> O(1)
	public static ArrayList<Integer> arrayOperation(int[][] arr, int[] ar) {

		//find diagonal sum in 2D array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}

		//find max element in 1D array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(sum);
		list.add(max);
		return list;
	}

	//approach 2 only for 2D array
	//tc -> O(n) and sc -> O(1)
	public static ArrayList<Integer> arrayOperation_2(int[][] arr, int[] ar) {
		//find diagonal sum in 2D array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
				sum += arr[i][i];
		}

		//find max element in 1D array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(sum);
		list.add(max);
		return list;
	}

	public static void main(String[] args) {
		/*int[][] arr = {{1,2,3}, {4,5,6}, {7, 8,9}};
		int[] ar = {3, 6, 9};*/
		int[][] arr = {{1,2}, {1, 2}};
		int[] ar = {10, 1};
		System.out.println(arrayOperation(arr,ar));
		System.out.println(arrayOperation_2(arr,ar));
	}
}
