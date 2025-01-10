package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an unsorted array arr. Find the count of elements less than or equal to the given element x.*/
public class CountOfSmallerElements {

	//tc  -> O(n) and sc -> O(1)
	public static int countSmallerElements(List<Integer> list, int x) {
		int count = 0;
		for (int i : list) {
			if (x >= i) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {};
		List<Integer> list = Arrays.asList(10, 1, 2, 8, 4, 5);
		int x = 9;
		System.out.println(countSmallerElements(list, x));
	}
}
