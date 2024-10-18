package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValueEqualToIndex {

	// tc -> O(n) and sc -> (1)
	public static List<Integer> valueEqualToIndex(List<Integer> list) {

		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i + 1 == list.get(i)) {
				ans.add(list.get(i));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15, 2, 45, 4, 7);
		System.out.println(valueEqualToIndex(list));

	}
}
