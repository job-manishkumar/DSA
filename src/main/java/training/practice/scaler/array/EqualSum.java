package training.practice.scaler.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*You are given an integer array A and an integer B. You are required to return the count having sum equal to B.*/
public class EqualSum {

	//approach 1 -- using two loops
	//tc -> O(n2) and sc -> O(1)
	public static int equalSum(int[] arr, int b) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == b) {
					count++;
				}
			}
		}
		return count;
	}

	//approach 2 - sorting (two pointer approach)
	// tc -> O(nlogn) and sc -> O(1)
	public static int equalSum_2(int[] arr, int b) {
		Arrays.sort(arr);
		int count = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == b) {
				count++;
			}
			if (arr[i] + arr[j] < b) {
				i++;
			} else {
				j--;
			}
		}
		return count;
	}

	//approach 3 -- using hashmap
	//tc -> O(n) and sc -> O(n)
	public static int equalSum_3(int[] arr, int b) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(b - arr[i])) {
				count++;
			} else {
				map.put(arr[i], 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 45, 27, 6, 6, 78, 9, 0};
		int b = 9;
		System.out.println(equalSum(arr, b));
		System.out.println("============");
		System.out.println(equalSum_2(arr, b));
		System.out.println("============");
		System.out.println(equalSum_3(arr, b));
	}
}
