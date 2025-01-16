package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an array arr[] and an integer x. You have to calculate the average for each element arr[i] and x and find
 * out whether that number exists in the array. Do it for all the elements of the array and store the count result in
 * another array for each index how many occurrences of average are present in the array.
 * <p>
 * Note: Always take the floor value of the average.
 */
public class AverageCountArray {

	/**
	 * approach 1
	 * tc -> O(n2) and sc -> O(1)
	 */
	public static ArrayList<Integer> countOccurrence(int[] arr, int x) { //!time limit exceed
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int avg = (arr[i] + x) / 2;
			for (int j = 0; j < arr.length; j++) {
				if (avg == arr[j]) {
					count++;
				}
			}
			list.add(count);
		}
		return list;
	}

	/**
	 * approach 2
	 * tc -> O(n) and sc -> O(n)
	 */

	public static ArrayList<Integer> countOccurrence_2(int[] arr, int x) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		for (int i : arr) {
			int avg = (i + x) / 2;
			list.add(map.getOrDefault(avg, 0));
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 8, 6, 2};
		int x = 2;
		int[] arr1 = {382, 90, 343, 555, 543, 342};
		int x1 = 218;
		int[] arr2 = {9, 5, 2, 4, 0, 3};
		int x2 = 3;
		System.out.println(countOccurrence(arr2, x2));
		System.out.println(countOccurrence_2(arr2, x2));
	}
}
