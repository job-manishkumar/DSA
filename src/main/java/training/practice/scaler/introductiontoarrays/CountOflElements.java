package training.practice.scaler.introductiontoarrays;

import java.util.Arrays;

/*Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.*/
public class CountOflElements {

	//approach 1
	//tc -> O(nlogn) and sc - >O(1)
	public static int countElements(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[arr.length - 1]) {
				count++;
			}
		}
		return count;
	}

	//same as Greater than itself question in Array package
	//tc -> O(n) and sc ->O(1)
	public static int countElements_2(int[] arr) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {5, 5, 3};
		System.out.println(countElements(arr));
		System.out.println(countElements(arr));
	}
}
