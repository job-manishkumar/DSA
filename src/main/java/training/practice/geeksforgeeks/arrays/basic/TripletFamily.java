package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array arr of integers. First sort the array then find whether three numbers are such that the sum of two
elements equals the third element.*/
public class TripletFamily {

	//tc -> O(nlogn+n2+logn=> n2) and sc -> O(1)
	public static boolean checkTriple(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (binarySearch(arr, sum)) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean binarySearch(int[] arr, int sum) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == sum) {
				return true;
			}
			if (arr[mid] > sum) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr1 = {6865, 8921, 22468, 20392, 27390, 31530, 8847, 26964, 20505, 21692, 7535, 31540, 18233, 19549,
				30152, 12717, 28032, 25526, 23414, 7868, 26691, 22744, 18960, 28208, 6250, 7192, 30569, 10775, 7450,
				22557, 2909};
		System.out.println(checkTriple(arr1));
		//System.out.println(checkTriple_2(arr));
	}
}
