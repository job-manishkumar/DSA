package training.classes.scaler.binaryproblems;

public class BinarySearch {

	//approach 1 -- leaner search
	// tc -> O(n) and sc ->(1)
	public static int searchLinear(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	// approach 2 -- binary search (if arr is sorted)
	// tc -> O(logn) and sc -> O(1)
	public static int binarySearch(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
		int k = 19;

		System.out.println(searchLinear(arr, k));
		System.out.println(binarySearch(arr, k));
	}
}
