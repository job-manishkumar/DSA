package training.practice.scaler.prefixsum;

import java.util.Arrays;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.*/
public class RunningSumOf1dArray {

	//approach 1
	//tc -> O(n2) and sc -> O(n)
	public static int[] runningSum(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j <= i; j++) {
				sum += arr[j];
			}
			result[i] = sum;
		}
		return result;
	}

	//approach 2
	//tc -> O(n) and sc -> O(n)
	public static int[] runningSum_2(int[] arr) {
		int[] result = new int[arr.length];
		result[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result[i] = result[i - 1] + arr[i];
		}
		return result;
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(runningSum(arr)));
		System.out.println(Arrays.toString(runningSum_2(arr)));
	}
}
