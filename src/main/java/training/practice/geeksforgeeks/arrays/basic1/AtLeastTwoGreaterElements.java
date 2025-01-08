package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given an array arr of distinct elements, the task is to return an array of all elements except the two greatest
elements in sorted order.*/
public class AtLeastTwoGreaterElements {

	//approach 1
	//tc -> O(nlogn) and sc -> O(n)
	public static long[] getElements(long[] arr) {
		Arrays.sort(arr);
		long[] result = new long[arr.length - 2];
		for (int i = 0; i < arr.length - 2; i++) {
			result[i] = arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		long[] arr = {2, 8, 7, 1, 5};
		System.out.println(Arrays.toString(getElements(arr)));
	}
}
