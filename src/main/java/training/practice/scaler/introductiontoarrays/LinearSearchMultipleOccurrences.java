package training.practice.scaler.introductiontoarrays;

import java.util.HashMap;
import java.util.Map;

/*Given an array A and an integer B, find the number of occurrences of B in A.*/
public class LinearSearchMultipleOccurrences {

	//tc -> O(n)  and sc ->(1);
	public static int countOccurrence(int[] arr, int b) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				count++;
			}
		}
		return count;
	}

	// approach 1 - using hashmap. but not required for this program
	// tc -> O(n) and sc -> O(n)
	public static int countOccurrence_2(int[] arr, int b) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map.get(b)==null?0:map.get(b);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
		int b = 2;
		System.out.println(countOccurrence(arr, b));
		System.out.println(countOccurrence_2(arr,b));
	}
}
