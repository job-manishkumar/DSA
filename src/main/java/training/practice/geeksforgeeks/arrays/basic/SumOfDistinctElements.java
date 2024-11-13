package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SumOfDistinctElements {

	//approach 1 using boolean array
	//tc -> O(n2) and sc-> O(1)  -- > time limit exceed
	public static int findElementSum(int[] arr) {
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
		for (int i = 0; i < isVisited.length; i++) {
			if (!isVisited[i]) {
				list.add(arr[i]);
			}
		}
		return list.stream().reduce(0, Integer::sum);
	}

	//approach 2 - using hashset
	//tc -> O(n) and sc -> O(n)
	public static int findElementSum_2(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		ArrayList<Integer> list = new ArrayList<>(set);
		return list.stream().reduce(0,Integer::sum);
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		//int[] arr = {5, 5, 5, 5, 5};
		System.out.println(findElementSum(arr));
		System.out.println(findElementSum_2(arr));
	}
}
