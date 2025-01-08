package training.practice.geeksforgeeks.arrays.basic1;

import java.util.HashMap;
import java.util.Map;

/*Given an array of N positive integers where all numbers occur even number of times except one number which occurs
odd number of times. Find the exceptional number.*/
public class ExceptionallyOdd {


	//approach 1
	// tc ->O(n2) and sc ->O(1)
	public static int getOddNumber(int[] arr) {// time limit exceed
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}
		return -1;
	}

	//approach 2 -- using hashmap
	//tc -> O(n) and sc ->(n)
	public static int getOddNumber_2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() % 2 != 0) {
				return e.getKey();
			}
		}
		return -1;
	}

	//approach 3
	public static int getOddNumber_3(int[] arr) {
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			number = number ^ arr[i];
		}
		return number;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 3, 1, 3};
		System.out.println(getOddNumber(arr));
		System.out.println("============");
		System.out.println(getOddNumber_2(arr));
		System.out.println("=========");
		System.out.println(getOddNumber_3(arr));
	}
}
