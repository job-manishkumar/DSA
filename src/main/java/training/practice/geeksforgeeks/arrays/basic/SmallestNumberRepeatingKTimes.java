package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr, the goal is to find out the smallest number that is repeated exactly ‘k’ times.
 * Note: If there is no such element then return -1.
 */
public class SmallestNumberRepeatingKTimes {

	//approach 1
	// tc -> O(n2) and sc  ->O(1)
	public static int getSmallestRepeatingNumber(int[] arr, int k) {//!time limit exceed
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == k) {
				min = Math.min(min, arr[i]);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	//approach 2
	//tc -> O(n2) and sc -> O(n)
	public static int getSmallestRepeatingNumber_2(int[] arr, int k) {//!time limit exceed
		boolean[] isVisited = new boolean[arr.length];
		int count = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if (isVisited[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isVisited[j] = true;
					count++;
				}
			}
			if (count == k) {
				min = Math.min(min, arr[i]);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	//approach 3
	//tc -> O(n) and sc - > O(n)
	public static int getSmallestRepeatingNumber_3(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == k) {
				min = Math.min(min, e.getKey());
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 3, 2};
		int k = 1;
		System.out.println(getSmallestRepeatingNumber(arr, k));
		System.out.println(getSmallestRepeatingNumber_2(arr, k));
		System.out.println(getSmallestRepeatingNumber_3(arr, k));
	}
}
