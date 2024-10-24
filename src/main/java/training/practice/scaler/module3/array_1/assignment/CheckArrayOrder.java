package training.practice.scaler.module3.array_1.assignment;

public class CheckArrayOrder {

	//tc -> O(n) and sc -> O(1)
	public static boolean checkArrayIncreasingOrder(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 2};
		//int[] arr = {1, 2, 1};
		System.out.println(checkArrayIncreasingOrder(arr));
	}
}
