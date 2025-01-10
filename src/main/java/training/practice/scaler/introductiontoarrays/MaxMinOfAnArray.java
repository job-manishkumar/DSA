package training.practice.scaler.introductiontoarrays;

/*Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.*/
public class MaxMinOfAnArray {

	//tc -> O(n) and sc -> O(1)
	public static int getSum(int[] arr) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return max + min;
	}

	public static void main(String[] args) {
		int[] arr = {-2, 1, -4, 5, 3};
		System.out.println(getSum(arr));
	}

}
