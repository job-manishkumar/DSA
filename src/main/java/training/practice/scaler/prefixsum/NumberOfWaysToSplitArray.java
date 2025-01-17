package training.practice.scaler.prefixsum;

/*You are given a 0-indexed integer array nums of length n.

nums contains a valid split at index i if the following are true:

The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
There is at least one element to the right of i. That is, 0 <= i < n - 1.
Return the number of valid splits in nums.*/
public class NumberOfWaysToSplitArray {

	//approach 1
	//tc -> O(n2) and sc -> O(1)
	public static int countWays(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j <= i; j++) {
				leftSum += arr[j];
			}
			for (int j = i + 1; j < arr.length; j++) {
				rightSum += arr[j];
			}
			if (leftSum >= rightSum) {
				count++;
			}
		}
		return count;
	}

	//approach 2
	//tc ->O(n) and sc -> O(N)
	public static int countWays_2(int[] arr) {
		int[] prefixSum = new int[arr.length];
		int count = 0;
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (i == 0) {
				if (prefixSum[i] >= (prefixSum[arr.length - 1])) {
					count++;
				}
			} else {
				if (prefixSum[i] >= (prefixSum[arr.length - 1] - prefixSum[i - 1])) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {10, 4, -8, 7};
		System.out.println(countWays(arr));
		System.out.println(countWays_2(arr));
	}
}
