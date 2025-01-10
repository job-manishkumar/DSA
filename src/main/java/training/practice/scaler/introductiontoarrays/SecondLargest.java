package training.practice.scaler.introductiontoarrays;

//You are given an integer array A. You have to find the second largest element/value in the array or report that no
// such element exists.
public class SecondLargest {

	//tc ->O(n) and sc ->O(1)
	public static int getSecondLargeElement(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max1 < arr[i]) {Second Largest
				max2 = max1;
				max1 = arr[i];
			}
			if (max2 < arr[i] && arr[i] != max1) {
				max2 = arr[i];
			}
		}
		return max2 == Integer.MIN_VALUE ? -1 : max2;
	}

	public static void main(String[] args) {
		int[] arr = {2};
		System.out.println(getSecondLargeElement(arr));
	}
}
