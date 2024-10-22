package training.classes.scaler.binaryproblems;

public class FindLastOccurrence {

	//approach 1 - linear search
	//tc -> O(n) and sc -> O(1)
	public static int findLastOccurrence(int[] arr, int k) {

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	//approach 2 - using binary search
	//tc -> O(logn) and sc ->O(1)
	public static int findLastOccurrence_2(int[] arr, int k) {

		int low = 0;
		int high = arr.length - 1;
		int ans = Integer.MIN_VALUE;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == k) {
				ans = mid;
				low = mid + 1;
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
		int k = -5;
		System.out.println(findLastOccurrence(arr, k));
		System.out.println(findLastOccurrence_2(arr, k));
	}
}
