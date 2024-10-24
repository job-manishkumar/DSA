package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

	//approach 1 using hashMap
	//tc -> O(n) and sc ->(n)
	public static String checkSubset(long[] arr1, long[] arr2) {

		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		//iterate arr1 over map
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {
				return "No";
			}
			if (map.get(arr2[i]) < 1) {
				return "No";
			}
			map.put(arr2[i], map.get(arr2[i]) - 1);
		}
		return "Yes";
	}

	public static void main(String[] args) {
		//long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
		//long[] a2 = {11, 3, 7, 1, 7};

		long[] a1 = {10, 5, 2, 23, 19};
		long[] a2 = {19, 5, 3};

		System.out.println(checkSubset(a1, a2));
	}
}
