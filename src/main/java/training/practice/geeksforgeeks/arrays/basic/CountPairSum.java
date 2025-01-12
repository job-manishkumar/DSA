package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashSet;
import java.util.Set;

/*Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from
 both arrays whose sum equals x.
Note: The pair has an element from each array.*/
public class CountPairSum {

	//approach 1
	//tc -> O(n2) and sc ->O(1)
	public static int countPairSum(int[] arr1, int[] arr2, int x) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] + arr2[j] == x) {
					count++;
				}
			}
		}
		return count;
	}

	//approach 2
	//tc -> O(n) and sc ->O(n)
	public static int countPairSum_2(int[] arr1, int[] arr2, int x) {
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(x - arr2[i])) {
				count++;
			}
		}
		return count;
	}

	//approach 3 - two pointer approach
	//tc -> O(n) and sc ->O(1)
	public static int countPairSum_3(int[] arr1, int[] arr2, int x) {
		int count = 0;
		int i = 0;
		int j = arr2.length - 1;
		while (i < arr1.length && j >= 0) {
			if (arr1[i] + arr2[j] == x) {
				count++;
				i++;
				j--;
			}
			else if (arr1[i] + arr2[j] > x) {
				j--;
			} else {
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 3, 5, 8};
		int x = 10;
		System.out.println(countPairSum(arr1, arr2, x));
		System.out.println(countPairSum_2(arr1, arr2, x));
		System.out.println(countPairSum_2(arr1,arr2,x));
	}
}
