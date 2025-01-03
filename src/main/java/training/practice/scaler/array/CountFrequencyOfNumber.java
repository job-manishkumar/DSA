package training.practice.scaler.array;

public class CountFrequencyOfNumber {

	//get the frequency of a number
	//tc ->O(n) and sc ->O(1)
	public static int countFrequency(int[] arr, int val) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		int value = 20;
		System.out.println(countFrequency(arr, value));
	}
}
