package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsInTheRange {

	//approach 1 -- brute force
	//tc -> O(n2) and sc -> O(1)
	public static boolean checkElementPresent(int[] arr, int A, int B) {

		for (int i = A; i <= B; i++) {
			boolean isPresent = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				return false;
			}
		}
		return true;
	}

	//approach 2 -- using collection
	//tc -> O(n) and sc -> O(n)
	public static boolean checkElementPresent_2(int[] arr, int A, int B) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		for (int i = A; i <= B; i++) {
			if (!list.contains(i)) {
				return false;
			}
		}
		return true;
	}

	//approach 3 -
	// tc -> O(range of (A,B)) and sc 0-> O(1)
	public static boolean checkElementPresent_3(int[] arr, int A, int B) {

		boolean[] visited = new boolean[B - A + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= A && arr[i] <= B) {
				visited[arr[i] - A] = true;
			}
		}
		//iteration on visited array
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		int[] a = {1, 4, 5, 2, 7, 8, 3};
		int A = 2;
		int B = 6;
		System.out.println(checkElementPresent(a, A, B));
		System.out.println(checkElementPresent_2(a, A, B));
		System.out.println(checkElementPresent_3(a, A, B));
	}
}
