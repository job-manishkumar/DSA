package training.practice.scaler.array;

public class CountMaxElement {

	//count element greater than B
	//tc -> O(n) and sc ->O(1)
	public static int countElement(int[] arr, int value) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (value < arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {3, 7, 1, 5, 9, 2};
		int b = 2;
		System.out.println(countElement(arr, b));
	}
}
