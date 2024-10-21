package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashSet;
import java.util.Set;

public class FightingTheDarkness {

	//tc -> O(n) and sc -> O(1)
	public static long getMaxDays(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return (long) max;
	}

	public static void main(String[] args) {

		int[] arr = {1, 1, 2};
		System.out.println(getMaxDays(arr));

	}
}
