package training.practice.scaler.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A.*/
public class CountFrequency {


	//approach 1  - using loop array
	// tc -> O(n2) and sc -> O(n)
	public static int[] countFrequency(int[] arr) {

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	//approach 2-- using hashmap
	//tc -> O(n) and sc ->O(n)
	public static int[] countFrequency_2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = map.get(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 1, 5, 1};
		System.out.println(Arrays.toString(countFrequency(arr)));
		System.out.println("================");
		System.out.println(Arrays.toString(countFrequency_2(arr)));
	}
}
