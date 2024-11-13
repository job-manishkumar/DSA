package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class TripletFamily {

	//tc -> O(n3) and sc -> O(1)
	public static boolean findTripletFamily(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				for (int k = 0; k < arr.length; k++) {
					if (sum == arr[k]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	//approach 2 using two pointer
	// tc -> O(n2) and sc -> O(1)
	public static boolean findTripletFamily_2(int[] arr) {

		Arrays.sort(arr);
		int y = arr.length - 2;
		int k = arr.length - 1;
		while (y >= 1 && k > y) {
			int i = 0;
			int j = arr.length - 2;
			while (i < j) {
				if (arr[i] + arr[j] == arr[k]) {
					return true;
				} else if (arr[i] + arr[j] > arr[k]) {
					j--;
				} else {
					i++;
				}
			}
			y--;
			k--;
		}
		return false;
	}


	public static void main(String[] args) {
		//int[] arr = {1, 5, 3, 10, 6};
		int[] arr = {3, 4, 5};
		System.out.println(findTripletFamily(arr));
		System.out.println(findTripletFamily_2(arr));
	}
}
