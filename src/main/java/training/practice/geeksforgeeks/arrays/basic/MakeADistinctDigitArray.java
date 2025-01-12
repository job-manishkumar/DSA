package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Given an array nums of positive integers of size N. Find all distinct digits present in nums.*/
public class MakeADistinctDigitArray {

	//approach 1
	//tc -> O(n*d) and sc -> (n)
	public static int[] getDistinctArray(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				set.add(arr[i] % 10);
				arr[i] = arr[i] / 10;
			}
		}
		int k = 0;
		int[] result = new int[set.size()];
		for (int i : set) {
			result[k++] = i;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {131, 11, 48};
		System.out.println(Arrays.toString(getDistinctArray(arr)));
	}
}
