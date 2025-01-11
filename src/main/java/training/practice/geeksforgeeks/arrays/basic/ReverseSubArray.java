package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array arr, you need to reverse a subarray of that array. The range of this subarray is given by indices L
and R (1-based indexing).*/
public class ReverseSubArray {

	//approach 2 -- in place reverse
	//tc -> O(n) and sc -> O(1)
	public static ArrayList<Integer> reverseArrayPart(ArrayList<Integer> list, int l, int r) {
		for (int i = l, j = r; i < j; i++, j--) {
			int temp = list.get(i - 1);
			list.set(i - 1, list.get(j - 1));
			list.set(j - 1, temp);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		int L = 2;
		int R = 4;
		System.out.println(reverseArrayPart(list, L, R));
	}
}
