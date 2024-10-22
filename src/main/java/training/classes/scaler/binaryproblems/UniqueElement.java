package training.classes.scaler.binaryproblems;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {

	//approach 1
	//tc -> O(n2) and sc -> O(n)
	public static int uniqueElement(int[] arr) {

		boolean[] isVisited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (isVisited[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					isVisited[j] = true;
				}
			}
			if (count == 1) {
				return arr[i];
			}
		}
		return -1;
	}

	//approach 2 - using hashmap
	//tc ->  O(n) and sc -> O(n)
	public static int uniqueElement_2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		//iterate to map for checking freq or count =1
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}

	//approach 3
	//tc -> O(n) and sc -> O(1)
	public static int uniqueElement_3(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

	//approach 4 - using binary search
	//tc -> O(logn) and sc -> O(1)
	public static int uniqueElement_4(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if ((mid ==0 || arr[mid] != arr[mid - 1]) &&(mid == arr.length-1 || arr[mid] != arr[mid + 1])) {
				return arr[mid];
			}
			if (arr[mid] == arr[mid - 1]) {
				mid = mid - 1;
			}
			if (mid % 2 == 0) {
				low = mid + 2;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		//int[] arr = {8, 8, 5, 5, 9, 9, 6, 2, 2, 4, 4};
		int[] arr = {5, 9, 9, 6, 6, 2, 2, 4, 4};
		System.out.println(uniqueElement(arr));
		System.out.println(uniqueElement_2(arr));
		System.out.println(uniqueElement_3(arr));
		System.out.println(uniqueElement_4(arr));

	}
}
