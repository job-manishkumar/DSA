package training.practice.geeksforgeeks.arrays.basic;

public class FirstOccurrenceInBinaryArray {

	//approach 1 -- linear search
	//tc -> O(n) and sc ->O(1)
	public static int findOccurrence(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				return i;
			}
		}
		return -1;
	}

	//approach 2 -- using binary search
	// tc -> O(logn) and sc -> O(1)
	public static int findOccurrence_2(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == 1) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1};
		System.out.println(findOccurrence(arr));
		System.out.println(findOccurrence_2(arr));
	}
}
