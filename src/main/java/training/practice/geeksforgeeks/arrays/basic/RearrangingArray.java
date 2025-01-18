package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the smallest
and the second element is the largest, the third element is the second smallest and the fourth element is the second
largest, and so on.*/
public class RearrangingArray {

	//approach 1
	public static ArrayList<Integer> rearrangeArray(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (i != j) {
				list.add(arr[i]);
				list.add(arr[j]);
				i++;
				j--;
			} else {
				list.add(arr[i]);
				i++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		//	int[] arr = {4, 5, 1, 2, 3};
		//int[] arr = {715, 92, 892, 195, 57, 168, 172};
		int[] arr = {735, 123, 2, 541, 156, 594};
		System.out.println(rearrangeArray(arr));
	}
}
