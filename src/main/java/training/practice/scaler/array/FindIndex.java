package training.practice.scaler.array;

public class FindIndex {

	//find the index of element B in array
	//tc -> O(n) and sc ->O(1)
	public static int getIndex(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int element = 30;
		System.out.println(getIndex(arr, element));
	}
}
