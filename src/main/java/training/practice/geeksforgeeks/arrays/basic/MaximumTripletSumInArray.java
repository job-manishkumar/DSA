package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given an array arr, the task is to find the maximum triplet sum in the array.*/
public class MaximumTripletSumInArray {

	//approach 1
	//tc -> O(nlogn) and sc ->O(1)
	public static int maxTripleSumArray(List<Integer> list) {
		Collections.sort(list);
		if (list.size() < 3) {
			return -1;
		}
		return list.get(list.size() - 1) + list.get(list.size() - 2) + list.get(list.size() - 3);
	}

	//approach 2
	//tc ->(n) and sc ->O(1)
	public static int maxTripleSumArray_2(List<Integer> list) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (max1 < list.get(i)) {
				max3 = max2;
				max2 = max1;
				max1 = list.get(i);
			} else if (max2 < list.get(i)) {
				max3 = max2;
				max2 = list.get(i);
			} else if (max3 < list.get(i)) {
				max3 = list.get(i);
			}
		}
		return max1 + max2 + max3;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 75, 87, 13, -69, -51, 61, 100, -61, 41);
		System.out.println(maxTripleSumArray(list));
		System.out.println(maxTripleSumArray_2(list));

	}
}
