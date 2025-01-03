package training.practice.scaler.array;

import java.util.Arrays;

public class ReverseArray {

	//reverse array function
	//approach 1 -- using extra space (array)
	//tc -> O(n) and sc -> O(n)
	public static int[] getReverseOrder(int[] arr) {

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		return result;
	}

	//approach 2 -- using no extra space
	// tc ->O(n) and sc -> O(1)
	public static void getReverseOrder_2(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(getReverseOrder(arr)));
		System.out.println("============");
		getReverseOrder_2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
