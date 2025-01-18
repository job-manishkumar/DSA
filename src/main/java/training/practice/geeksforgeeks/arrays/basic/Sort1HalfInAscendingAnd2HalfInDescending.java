package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr of even size, sort the first half of the array in ascending order and the second half in
descending order.*/
public class Sort1HalfInAscendingAnd2HalfInDescending {

	//approach 1
	//tc -> O(nlogn) and sc -> O(n)
	public static ArrayList<Integer> customSorting(int[] arr) {
		int mid = arr.length / 2;
		Arrays.sort(arr, 0, mid);
		Arrays.sort(arr, mid, arr.length);
		reverse(arr, mid, arr.length - 1);

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		return list;
	}

	public static void reverse(int[] arr, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {20, 10, 50, 40};
		System.out.println(customSorting(arr));
	}
}
