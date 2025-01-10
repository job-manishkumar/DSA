package training.practice.geeksforgeeks.arrays.basic;

/*You are given an array of integers, your task is to divide the array into two sub-arrays (left and right)
containing half of the array elements. Find the sum of the subarrays and then return the multiply of both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.*/
public class MultiplyLeftAndRightArraySum {

	public static int multiplySum(int[] arr) {
		if (arr.length == 1) {
			return 0;
		}
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			leftSum += arr[i];
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			rightSum += arr[i];
		}
		return leftSum * rightSum;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(multiplySum(arr));


	}
}
