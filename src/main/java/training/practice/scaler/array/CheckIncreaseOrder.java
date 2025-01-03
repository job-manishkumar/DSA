package training.practice.scaler.array;

/*Given an array A, check if it is sorted in non-decreasing order or not.*/
public class CheckIncreaseOrder {

	//check array is in increasing order or not?
	//tc -> O(n) and sc -> O(1)
	public static boolean isIncrement(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] >= arr[i]) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6, 12, 4, 67, 8};
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(isIncrement(arr));
		System.out.println("=============");
		System.out.println(isIncrement(arr1));
	}
}
