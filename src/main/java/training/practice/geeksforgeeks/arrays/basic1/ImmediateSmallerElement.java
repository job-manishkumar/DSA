package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given an integer array arr. For each element in the array, check whether the right adjacent element (on the next
immediate position) of the array is smaller. If the next element is smaller, update the current index to that element
. If not, then update to -1.

Note: Update the array in itself.*/
public class ImmediateSmallerElement {

	public static void getImmediateSmallerElement(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i] > arr[i + 1] ? arr[i + 1] : -1;
			}
			arr[arr.length - 1] = -1;
		}
	}


	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 5, 3};
		getImmediateSmallerElement(arr);
		System.out.println(Arrays.toString(arr));
	}
}
