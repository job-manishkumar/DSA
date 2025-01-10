package training.practice.scaler.introductiontoarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array A and an integer B.  A pair(i,j) in the array is a good pair if i!=j and (A[i] + A[j] == B). Check
if any good pair exist or not.*/
public class CheckGoodPair {

	//approach 1
	//tc -> O(n2) and sc ->O(1)
	public static boolean isGoodPair(int[] arr, int b) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == b) {
					return true;
				}
			}
		}
		return false;
	}

	//approach 2
	//tc  -> O(nlogn) and sc -> O(1)
	public static boolean isGoodPair_2(int[] arr, int b) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == b) {
				return true;
			}
			if (arr[i] + arr[j] > b) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	//approach 3 -- using hashmap
	//tc -> O(n) and sc -> O(n)
	public static boolean isGoodPair_3(int[] arr, int b) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int nextElement = b - arr[i];
			if (map.containsKey(nextElement)) {
				return true;
			} else {
				map.put(arr[i], 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 4};
		int b = 4;
		System.out.println(isGoodPair(arr, b));
		System.out.println(isGoodPair_2(arr, b));
		System.out.println(isGoodPair_3(arr, b));
	}
}
