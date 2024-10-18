package training.practice.geeksforgeeks.arrays.basic;

public class PeakElement {


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

	public static void main(String[] args) {
		//int[] a = {1, 2, 3};
		int[] a = {1, 1, 1, 2, 1, 1, 1};
		System.out.println(peakElement(a));
	}

}
