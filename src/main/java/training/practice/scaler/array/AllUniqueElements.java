package training.practice.scaler.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given a dynamic array A. Return a dynamic array which has all unique elements form the given array.*/
public class AllUniqueElements {

	//approach 1 - using two loops
	//tc -> O(n2) and sc ->O(1)
	public static List<Integer> findUniqueElements(int[] arr) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	//approach 2  -- using visited array
	//tc -. O(n2) and sc -> O(1)
	public static List<Integer> findUniqueElements_2(int[] arr) {
		List<Integer> list = new ArrayList<>();
		boolean[] isVisited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (isVisited[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isVisited[j] = true;
					isVisited[i] = true;
				}
			}
		}
		for (int i = 0; i < isVisited.length; i++) {
			if (!isVisited[i]) {
				list.add(arr[i]);
			}
		}
		return list;
	}

	// approach 3 - using hashmap
	//tc -> O(n) and sc -> O(n)
	public static List<Integer> findUniqueElements_3(int[] arr) {
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				list.add(e.getKey());
			}
		}
		return list;
	}


	public static void main(String[] args) {
		int[] arr = {8, 54, 79, 62, 33, 59, 14, 8, 20, 27, 33, 54};
		System.out.println(findUniqueElements(arr));
		System.out.println("============");
		System.out.println(findUniqueElements_2(arr));
		System.out.println("=============");
		System.out.println(findUniqueElements_3(arr));
	}
}
