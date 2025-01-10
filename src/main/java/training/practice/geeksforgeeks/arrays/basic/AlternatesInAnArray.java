package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;

/*You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index
0).*/
public class AlternatesInAnArray {

	public static ArrayList<Integer> getAlternativeNumber(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i += 2) {
			list.add(arr[i]);
		}
		return list;
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(getAlternativeNumber(arr));
	}
}
