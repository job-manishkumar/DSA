package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayInGroup {

	//tc ->O(n) and sc-> O(1)
	public static void reverseArrayByK(List<Long> arr, int k) {

		for (int i = 0; i < arr.size(); i += k) {

			int startIndex = i;
			int endIndex = i + k - 1;
			if (endIndex > arr.size() - 1) {
				endIndex = arr.size() - 1;
			}

			//reverse array
			while (startIndex < endIndex) {
				long temp = arr.get(startIndex);
				arr.set(startIndex, arr.get(endIndex));
				arr.set(endIndex, temp);
				startIndex++;
				endIndex--;
			}
		}
	}

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 4, 5};
		List<Long> list = Arrays.asList(1L, 2L, 3L, 4L, 5L);
		//List<Long> list = Arrays.asList(5L, 6L, 8L, 9L);
		int k = 3;
		//int k = 5;

		reverseArrayByK(list, k);
		System.out.println(list);
	}
}
