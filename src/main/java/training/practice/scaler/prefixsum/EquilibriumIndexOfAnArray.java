package training.practice.scaler.prefixsum;

import java.util.Arrays;

/*You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of
elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is
considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.*/
public class EquilibriumIndexOfAnArray {

	//approach 1
	// tc -> O(n2) and sc ->O(1)
	public static int getEquilibriumIndex(int[] arr) {
		int rSum = 0;
		int lSum = 0;
		for (int i = 1; i < arr.length; i++) {
			rSum += arr[i];
		}
		if (0 == rSum) {
			return 0;
		}
		for (int i = 1; i < arr.length - 1; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += arr[j];
			}
			for (int j = i + 1; j < arr.length; j++) {
				rightSum += arr[j];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			lSum += arr[i];
		}
		if (0 == lSum) {
			return arr.length - 1;
		}
		return -1;
	}

	//approach 2
	public static int getEquilibriumIndex_2(int[] arr) {

		int[] prefixSum = new int[arr.length];
		int[] suffixSum = new int[arr.length];
		//calculate prefix sum with another array
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		//calculate suffix sum with another array
		suffixSum[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			suffixSum[i] = suffixSum[i + 1] + arr[i];
		}
		for (int i = 0; i < prefixSum.length; i++) {
			if (prefixSum[i] == suffixSum[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(getEquilibriumIndex(arr));
		System.out.println(getEquilibriumIndex_2(arr));
	}
}

