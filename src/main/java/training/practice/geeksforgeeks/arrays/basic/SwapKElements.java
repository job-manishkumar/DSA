package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an array arr, swap the kth element from the beginning with the kth element from the end.

Note: 1-based indexing is followed.*/
public class SwapKElements {

	// tc ->O(1) and sc  ->(1)
	public static void swapKElement(List<Integer> list, int k) {
		int startIndex = k - 1;
		int endIndex = list.size() - k;
		int temp = list.get(startIndex);
		list.set(startIndex, list.get(endIndex));
		list.set(endIndex, temp);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int k = 3;
		swapKElement(list, k);
		System.out.println(list);
	}
}
