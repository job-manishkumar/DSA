package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashMap;
import java.util.Map;

/*Given an array, the task is to find the difference between the highest occurrence and lowest occurrence of any
number in an array.
Note: If only one type of element is present in the array return 0*/
public class DifferenceBetweenHighestAndLowestOccurrence {

	//approach 1 - using hashmap
	//tc -> O(n) and sc -> O(n)
	public static int findOccurrenceDifference(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (max < e.getValue()) {
				max = e.getValue();
			}
			if (min > e.getValue()) {
				min = e.getValue();
			}
		}
		return max - min;
	}

	public static void main(String[] args) {
		int[] arr = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
		System.out.println(findOccurrenceDifference(arr));
	}
}
