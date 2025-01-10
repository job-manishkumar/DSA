package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an array arr of positive integers. Reverse every sub-array group of size k.
 * Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't
 * return any array, modify the given array in place.*/
public class ReverseArrayInGroups {

	public static void reverseArraysInGroups(List<Long> list, int k) {
		for (int i = 0; i < list.size(); i += k) {
			int ei = i + k - 1;
			if (i + k - 1 > list.size() - 1) {
				ei = list.size() - 1;
			}
			reverse(list, i, ei);
		}
	}

	public static void reverse(List<Long> list, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			long temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static void main(String[] args) {
		/*List<Long> list = Arrays.asList(1, 2, 3, 4, 5);
		int k = 3;*/
		List<Long> list = Arrays.asList(5L, 6L, 8L, 9L);
		int k = 5;
		reverseArraysInGroups(list, k);
		System.out.println(list);
	}
}
