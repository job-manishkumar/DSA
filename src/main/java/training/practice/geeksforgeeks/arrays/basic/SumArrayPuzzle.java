package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an array arr[] of integers, change the given array such that at any index i it contains the sum of all
elements except itself. Simple way arr[i] should be arr[0] + arr[1] ... arr[i-1] + arr[i+1] ... arr[n-1].*/
public class SumArrayPuzzle {

	//approach 1
	//tc -> O(n2) and sc ->O(n)
	public static void getSumArray(List<Integer> list) {// time limit exception
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			for (int j = 0; j < list.size(); j++) {
				if (i != j) {
					sum += list.get(j);
				}
			}
			result[i] = sum;
		}
		for (int i = 0; i < list.size(); i++) {
			list.set(i, result[i]);
		}
	}

	//approach 2
	//tc -> O(n) and sc -> O(1)
	public static void getSumArray_2(List<Integer> list) {
		int totalSum = 0;
		for (int i = 0; i < list.size(); i++) {
			totalSum += list.get(i);
		}
		for (int i = 0; i < list.size(); i++) {
			list.set(i, (totalSum - list.get(i)));
		}
	}


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 6, 4, 8, 9);
		getSumArray(list);
		System.out.println(list);
		List<Integer> list1 = Arrays.asList(3, 6, 4, 8, 9);
		getSumArray_2(list1);
		System.out.println(list1);
	}
}
