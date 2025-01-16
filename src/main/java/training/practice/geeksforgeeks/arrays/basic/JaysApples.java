package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a queue of persons represented by an array of integers, where each person is identified by a specific
 * integer, find the minimum kilograms of apples that need to be distributed, ensuring that each person receives 1
 * kilogram of apples only once.
 */
public class JaysApples {

	//approach 1
	//tc -> O(n) and sc -> O(n)
	public static int findJoysUniqueApple(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}
		return set.size();
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1};
		int[] arr1 = {1, 2, 3, 1, 2};
		System.out.println(findJoysUniqueApple(arr1));
	}
}
