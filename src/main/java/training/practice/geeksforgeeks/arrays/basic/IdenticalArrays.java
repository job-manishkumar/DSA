package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdenticalArrays {

	//approach 1 -- using sorting
	//tc -> O(nlogn) and sc -> O(1)
	public static boolean checkArrays(List<Integer> arr1, List<Integer> arr2) {
		Collections.sort(arr1);
		Collections.sort(arr2);
		for (int i = 0; i < arr1.size(); i++) {
			if (arr1.get(i) != arr2.get(i)) {
				return false;
			}
		}
		return true;
	}

	//approach 2 -- using hashmap
	//tc -> O(n) and sc -> (n)
	public static boolean checkArrays_2(List<Integer> arr1, List<Integer> arr2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.size(); i++) {
			if (map.containsKey(arr1.get(i))) {
				map.put(arr1.get(i), map.get(arr1.get(i)) + 1);
			} else {
				map.put(arr1.get(i), 1);
			}
		}
		for (int i = 0; i < arr2.size(); i++) {
			if (!map.containsKey(arr2.get(i))) {
				return false;
			}
			int freq = map.get(arr2.get(i));
			if (freq < 1) {
				return false;
			}
			map.put(arr2.get(i), map.get(arr2.get(i)) - 1);
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 1, 2, 5);
		/*List<Integer> list1 = Arrays.asList(1, 2, 4);
		List<Integer> list2 = Arrays.asList(3, 2, 1);*/
		System.out.println(checkArrays(list1, list2));
		System.out.println(checkArrays_2(list1, list2));
	}
}
