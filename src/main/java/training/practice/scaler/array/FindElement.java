package training.practice.scaler.array;

public class FindElement {

	//find element in array
	//tc ->O(n) and sc -> O(1)
	public static boolean isPresent(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		int[] arr = {3, 7, 1, 5, 9, 2};
		int element = 8;
		System.out.println(isPresent(arr, element));
	}
}
