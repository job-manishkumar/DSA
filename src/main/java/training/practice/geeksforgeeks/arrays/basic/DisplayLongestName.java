package training.practice.geeksforgeeks.arrays.basic;

/*Given a list of names, display the longest name. If there are multiple names of the longest size, return the first
occurring name.*/

import java.util.Arrays;
import java.util.List;

public class DisplayLongestName {

	//tc -> O(n) and sc ->O(1)
	public static String getLongestName(List<String> list) {
		int maxLength = Integer.MIN_VALUE;
		int maxLengthIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			int length = s.length();
			if (maxLength < length) {
				maxLength = length;
				maxLengthIndex = i;
			}
		}
		return list.get(maxLengthIndex);
	}

	public static void main(String[] args) {
		//List<String> arr = Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks");
		List<String> arr = Arrays.asList("Apple", "Mango", "Orange", "Banana");
		System.out.println(getLongestName(arr));
	}
}
