package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

public class DisplayLongestName {

	//approach 1 - brute force without inbuilt function
	//tc -> O(n) and sc -> O(1)
	public static String getLongestName(List<String> names) {
		int maxLength = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < names.size(); i++) {
			if (maxLength < names.get(i).length()) {
				maxLength = names.get(i).length();
				index = i;
			}
		}
		return names.get(index);
	}

	public static void main(String[] args) {

		//List<String> list = Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks");
		List<String> list = Arrays.asList("Apple", "Mango", "Orange", "Banana");
		System.out.println(getLongestName(list));
	}

}
