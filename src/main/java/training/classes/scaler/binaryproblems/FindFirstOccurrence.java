package training.classes.scaler.binaryproblems;

public class FindFirstOccurrence {

	//approach 1- brute force
	//tc -> O(n) and sc  -> O(1)
	public static int findElement(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	//approach 2 - using binary search
	// tc -> O(logn) and sc -> O(1)
	public static int findElement_2(int[] arr, int k) {

		int low = 0;
		int high = arr.length - 1;
		int ans = Integer.MIN_VALUE;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == k) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = {-5, -5, -3, 0, 0, 1, 5, 5, 5, 5, 5, 8, 10, 10, 15};
		int k = 8;
		System.out.println(findElement(arr, k));
		System.out.println(findElement_2(arr, k));


	}
}
