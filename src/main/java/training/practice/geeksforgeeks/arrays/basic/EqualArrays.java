package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualArrays {

	//approach 1
	//TC -> O(nlogn) SC -> O(1)
	public static boolean checkEqualArrays(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	//approach 2
	//TC ->O(n) and SC - > O(n)
	public static boolean checkEqualArrays_2(int[] arr1, int[] arr2) {

		//insert all elements of arr1 to hashmap
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}

		//checking arr1 element in map
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {
				return false;
			}
			if (map.get(arr2[i]) < 1) {
				return false;
			}
			map.put(arr2[i], map.get(arr2[i]) - 1);
		}
		return true;
	}


	public static void main(String[] args) {

		int[] arr1 = {1, 2, 5, 4, 0};
		int[] arr2 = {2, 4, 5, 0, 1};

		System.out.println("is Arrays are equal = " + checkEqualArrays(arr1, arr2));
		System.out.println("is Arrays are equal = " + checkEqualArrays_2(arr1, arr2));

	}
}
