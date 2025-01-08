package training.practice.geeksforgeeks.arrays.basic1;

import java.util.Arrays;

/*Given a sorted array arr and a value x, return an array of size 2. The first value is the number of elements less
than or equal to x, and the second value is the number of elements greater than or equal to x.*/
public class SmallerAndLarger {

	//approach 1
	//tc -> O(n) and sc -> O(1)
	public static int[] countSmallerAndLarger(int[] arr, int x) {
		int countLarge = 0;
		int countSmall = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= x) {
				countLarge++;
			}
			if (arr[i] <= x) {
				countSmall++;
			}
		}
		return new int[]{countSmall, countLarge};
	}

	//approach 2 -- using binary search
	//tc -> O(logn) and sc -> O(1)
	public static int[] countSmallerAndLarger_2(int[] arr, int x) {
		int countLarge = binarySearchForLarge(arr, x);
		int countSmall = binarySearchForSmall(arr, x);
		return new int[]{countSmall,countLarge};

	}

	private static int binarySearchForSmall(int[] arr, int x) {
		int count = 0;
		int low = 0;
		int high = arr.length;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] <= x) {
				count = mid+1;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return count;
	}

	private static int binarySearchForLarge(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		int count = 0;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] >= x) {
				count = arr.length-mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 12, 12, 12, 19};
		int x = 12;
		System.out.println(Arrays.toString(countSmallerAndLarger(arr,x)));
		System.out.println("==============");
		System.out.println(Arrays.toString(countSmallerAndLarger_2(arr,x)));
	}

}
