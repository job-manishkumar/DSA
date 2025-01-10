package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashMap;
import java.util.Map;

/*Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check
if the array contains all elements in the given range (inclusive).

Note: If the array contains all elements in the given range return true otherwise return false.*/
public class ElementsInTheRange {

	//approach 1
	//tc -> O(n*m) and sc -> O(m)
	public static boolean checkRange(int[] arr, int A, int B) {
		boolean[] result = new boolean[B - A + 1];
		int k = 0;
		for (int i = A; i <= B; i++) {
			boolean isPresent = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					isPresent = true;
					break;
				}
			}
			result[k] = isPresent;
			k++;
		}
		for (int i = 0; i < result.length; i++) {
			if (!result[i]) {
				return false;
			}
		}
		return true;
	}

	//approach 2 -
	//tc  -> O(n) and sc -> O(n)
	public static boolean checkRange_2(int[] arr, int A, int B) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = A; i <= B; i++) {
			if (!map.containsKey(i)) {
				return false;
			}
		}
		return true;
	}

	//approach 3
	//tc ->(n) and sc ->O(b-a+1) == O(1)
	public static boolean checkRange_3(int[] arr, int A, int B) {
		boolean[] result = new boolean[B - A + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= A && arr[i] <= B) {
				result[arr[i] - A] = true;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (!result[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 2, 7, 8, 3};
		int A = 2;
		int B = 5;
		System.out.println(checkRange(arr, A, B));
		System.out.println(checkRange_2(arr, A, B));
		System.out.println(checkRange_3(arr, A, B));
	}
}
