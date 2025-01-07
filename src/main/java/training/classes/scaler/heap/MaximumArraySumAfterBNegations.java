package training.classes.scaler.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/*Given an array of integers A and an integer B. You must modify the array exactly B number of times. In a single modification, we can replace any one array element A[i] by -A[i].
You need to perform these modifications in such a way that after exactly B modifications, sum of the array must be maximum.

NOTE: You can perform the modification on the same element multiple times.*/
public class MaximumArraySumAfterBNegations {

	//approach 1 using sorting
	//tc -> O(b*nlogn) and sc->(1)
	public static int getMaximumArraySum(int[] arr, int b) {

		for (int i = 0; i < b; i++) {
			Arrays.sort(arr);
			int element = -arr[0];
			arr[0] = element;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	//approach 2  - using priority queue
	public static int getMaximumArraySum_2(int[] arr, int b) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			p.add(arr[i]);
		}
		for (int i = 0; i < b; i++) {
			int val = p.remove();
			p.add(-val);
		}
		int sum = 0;
		while (!p.isEmpty()) {
			sum += p.remove();
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {24, -68, -29, -9, 84};
		int b = 4;
		System.out.println(getMaximumArraySum(arr, b));
		System.out.println("2 option:\n" + getMaximumArraySum_2(arr, b));
		System.out.println("===================");
		int[] arr1 = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
		int b1 = 10;
		System.out.println(getMaximumArraySum(arr1, b1));
		System.out.println("2 option:\n" + getMaximumArraySum_2(arr1, b1));
	}
}
