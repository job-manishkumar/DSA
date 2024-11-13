package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	// approach 1
	//tc -> O(n2) and sc -> O(1) -- > time limit exceed
	public static ArrayList<Integer> removeDuplicates(int[] arr) {

		boolean[] isVisited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (isVisited[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isVisited[j] = true;
				}
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!isVisited[i]) {
				list.add(arr[i]);
			}
		}
		return list;
	}

	//approach 2 using hashset
	//tc -> O(n) and sc ->)(n)
	public static ArrayList<Integer> removeDuplicates_2(int[] arr) {
		HashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 1, 4, 2};
		//int[] arr = {1, 2, 3, 4,4,4,4,4};
		int[] arr = {19,19,11,17,15,15,20,11,10,17,17,15,18,16,17,13,17,19};
		System.out.println(removeDuplicates(arr));
		System.out.println(removeDuplicates_2(arr));
	}
}
