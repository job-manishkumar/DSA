package training.practice.geeksforgeeks.arrays.basic;

import java.util.LinkedHashSet;
import java.util.Set;

/*You are given an array arr. Find the sum of distinct elements in an array.*/
public class SumOfDistinctElements {

	//approach 1
	// tc -> O(n2) and sc -> O(1)
	public static int distinctElementSum(int[] arr) { // time limit exception
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				sum += arr[i];
			}
		}
		return sum;
	}

	//approach 2 -- using set
	//tc ->O(n) and sc ->O(n)
	public static int distinctElementSum_2(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i : set) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		//int[] arr = {5, 5, 5, 5, 5};
		System.out.println(distinctElementSum(arr));
		System.out.println(distinctElementSum_2(arr));
	}
}
