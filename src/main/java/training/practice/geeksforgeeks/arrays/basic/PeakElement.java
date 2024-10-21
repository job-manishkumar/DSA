package training.practice.geeksforgeeks.arrays.basic;

public class PeakElement {


	//approach 1
	//TC->O(N) & SC->O(1)
	public static int peakElement(int[] arr) {

		if (arr.length == 0) {
			return -1;
		}
		if (arr.length == 1 || arr[0] >= arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] >= arr[arr.length - 2]) {
			return arr.length - 1;
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	//approach 2 using binary search
	//TC -> (nlogn) and sc -> (1)
	public static int peakElement_2(int[] arr) {

		if (arr.length == 0) {
			return -1;
		}
		if (arr.length == 1 || arr[0] > arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr.length - 1;
		}

		int lowIndex = 0;
		int highIndex = arr.length - 1;


		while (lowIndex <= highIndex) {
			int mid = lowIndex + ((highIndex - lowIndex) / 2);
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid - 1] > arr[mid]) {
				highIndex = mid - 1;
			} else {
				lowIndex = mid + 1;
			}

		}
		return -1;
	}


	public static void main(String[] args) {
		//int[] a = {1, 2, 3};
		int[] a = {1, 1, 1, 2, 1, 1, 1};
		System.out.println(peakElement(a));
		a = new int[]{2, 4, 12, 8, 10, 14, 16, 13};
		System.out.println(peakElement_2(a));
	}

}
