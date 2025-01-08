package training.practice.geeksforgeeks.arrays.basic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array arr[]. The task is to find the largest element and return it.*/
public class LargestElementInArray {

	//approach 1 -- using loop without in-build function
	public static int getLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	//approach 2 -- using loop with in-build function
	public static int getLargestElement_2(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i],max);
		}
		return max;
	}

	//approach 3 -- using sorting but tc will increase
	//tc -> O(nlogn)
	public static int getLargestElement_3(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		int[] arr = {1, 8, 7, 56, 90};
		System.out.println(getLargestElement(arr));
		System.out.println("===========");
		System.out.println(getLargestElement_2(arr));
		System.out.println("==============");
		System.out.println(getLargestElement_3(arr));
	}
}
