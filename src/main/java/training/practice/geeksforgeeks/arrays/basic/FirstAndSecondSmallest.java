package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array, arr of integers, your task is to return the smallest and second smallest element in the array. If
the smallest and second smallest do not exist, return -1.*/
public class FirstAndSecondSmallest {

	//approach 1
	// tc -> O(nlogn) and sc -> O(1)
	public static int[] getFirstSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return new int[]{arr[0], arr[1]};
	}


	// approach 2
	// tc -> O(n) and sc -> O(1)// and element should be unique
	public static int[] getFirstSecondSmallest_2(int[] arr) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (min1 > arr[i]) {
				min2 = min1;
				min1 = arr[i];
			}
			if (min2 > arr[i] && arr[i] != min1) {
				min2 = arr[i];
			}
		}
		if(min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE){
			return new int[]{-1};
		}
		return new int[]{min1, min2};
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 6};
		System.out.println(Arrays.toString(getFirstSecondSmallest_2(arr)));
	}
}
