package training.classes.scaler.binaryproblems;

public class LocalMinElement {

	//approach 1
	//tc -> O(n) and sc -> O(1)
	public static int getLocalMin(int[] arr) {

		if (arr.length == 0 || arr[0] < arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] < arr[arr.length - 2]) {
			return arr.length - 1;
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	//approach 2 -- using binary search
	//tc -> O(logn) and sc -> O(1)
	public static int getLocalMin_2(int[] arr) {

		if (arr.length == 1 || arr[0] < arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] < arr[arr.length - 2]) {
			return 1;
		}
		int low = 1;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				return mid;
			} else if (arr[mid - 1] < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int[] arr = {32, 12, 11, 8, 10, 14, 16, 17};
		System.out.println(getLocalMin(arr));
		System.out.println(getLocalMin_2(arr));

	}
}
