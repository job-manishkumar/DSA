package training.practice.scaler.prefixsum;

/*Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible
ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] +
nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right
 side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.*/
public class FindTheMiddleIndexInArray {

	// it is same as EquilibriumIndexOfAnArray

	//approach 1
	public static int findMiddleIndex(int[] arr) {

		int rSum = 0;
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
		int lSum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			lSum += arr[i];
		}
		if (0 == lSum) {
			return arr.length - 1;
		}
		return -1;
	}

	//approach 2
	public static int findMiddleIndex_2(int[] arr) {
		int[] prefixSum = new int[arr.length];
		int[] suffixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		suffixSum[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			suffixSum[i] = suffixSum[i + 1] + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (prefixSum[i] == suffixSum[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, -1, 4};
		System.out.println(findMiddleIndex(arr));
		System.out.println(findMiddleIndex_2(arr));
	}
}
