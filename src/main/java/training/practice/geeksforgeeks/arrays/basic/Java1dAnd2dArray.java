package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;

/*Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the
left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.*/
public class Java1dAnd2dArray {

	//approach 1 - only for sum of left diagonal
	//tc -> O(n2) and sxc ->O(1)
	public static ArrayList<Integer> arrayOperation(int[][] arr, int[] brr) {
		ArrayList<Integer> result = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}
		result.add(sum);
		//find max from brr
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < brr.length; i++) {
			if (max < brr[i]) {
				max = brr[i];
			}
		}
		result.add(max);
		return result;
	}

	//approach 2 - only for sum of left diagonal
	//tc -> O(n) and sc -> O(1)
	public static ArrayList<Integer> arrayOperation_2(int[][] arr, int[] brr) {
		ArrayList<Integer> result = new ArrayList<>();
		int sum = -0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		result.add(sum);
		//find max from brr
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < brr.length; i++) {
			if (max < brr[i]) {
				max = brr[i];
			}
		}
		result.add(max);
		return result;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int N = 3;
		int[] brr = {3, 6, 9};
		System.out.println(arrayOperation(arr, brr));
		System.out.println(arrayOperation_2(arr, brr));
	}
}
