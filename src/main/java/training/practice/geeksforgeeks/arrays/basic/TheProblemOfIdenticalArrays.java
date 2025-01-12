package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Check whether given two arrays arr1[], arr2[] are identical or not. Two arrays are called identical arrays if they
contain the same element with the same count, regardless of the order of elements.*/
public class TheProblemOfIdenticalArrays {

	//approach 1
	//tc ->O(n) and sc - >O(n)
	public static boolean isIdenticalArrays(List<Integer> list1, List<Integer> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.size(); i++) {
			if (map.containsKey(list1.get(i))) {
				map.put(list1.get(i), map.get(list1.get(i)) + 1);
			} else {
				map.put(list1.get(i), 1);
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			if (!map.containsKey(list2.get(i))) {
				return false;
			}
			if (map.get(list2.get(i)) < 1) {
				return false;
			}
			map.put(list2.get(i), map.get(list2.get(i)) - 1);
		}
		return true;
	}

	//approach 2
	//tc -> O(nlogn) and sc -> O(1)
	public static boolean isIdenticalArrays_2(List<Integer> list1, List<Integer> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}
		Collections.sort(list1);
		Collections.sort(list2);
		for (int i = 0; i < list1.size(); i++) {
			if (!list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 1, 2, 5);
		System.out.println(isIdenticalArrays(list1, list2));
		System.out.println(isIdenticalArrays_2(list1, list2));
	}
}
