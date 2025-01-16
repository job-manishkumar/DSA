package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given two arrays arr1 and arr2, return the merged array in ascending order containing unique elements.
 */
public class MergeAndSort {


	//approach 1
	public static int[] mergeAndSort(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);// nlogn
		Arrays.sort(arr2);//nlogn
		int[] result = new int[arr1.length + arr2.length];//O(n+m)
		Set<Integer> set = new LinkedHashSet<>();
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
				k++;
			} else {
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (i < arr1.length) {
			while (i < arr1.length) {
				result[k] = arr1[i];
				i++;
				k++;
			}
		}
		if (j < arr2.length) {
			while (j < arr2.length) {
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		for (int val : result) {
			set.add(val);
		}
		result = new int[set.size()];
		int x = 0;
		for (int val1 : set) {
			result[x] = val1;
			x++;
		}
		return result;
	}

	//approach 2

	public static int[] mergeAndSort_2(int[] arr1, int[] arr2) {
		Set<Integer> set = new TreeSet<>();
		for (int val1 : arr1) {
			set.add(val1);
		}
		for (int val2 : arr2) {
			set.add(val2);
		}
		int[] result = new int[set.size()];
		int x = 0;
		for (int i : set) {
			result[x] = i;
			x++;
		}
		return result;
	}


	public static void main(String[] args) {
		int[] arr1 = {27, 77, 12, 7, 18};
		int[] arr2 = {11, 32};
		System.out.println(Arrays.toString(mergeAndSort(arr1, arr2)));
		System.out.println(Arrays.toString(mergeAndSort_2(arr1, arr2)));
	}
}
