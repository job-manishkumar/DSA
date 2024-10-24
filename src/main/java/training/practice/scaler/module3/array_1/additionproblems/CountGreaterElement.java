package training.practice.scaler.module3.array_1.additionproblems;

public class CountGreaterElement {

	//tc -> O(n) and sc ->(1)
	public static int countElement(int[] arr, int b) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > b) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		//int[] arr = {12,26,25,21,18,10,45,40,29,30};
		//int b =25;
		int[] arr = {22, 28, 23, 21, 18, 15, 24, 40, 12, 30, 10, 19};
		int b = 20;

		System.out.println(countElement(arr, b));

	}
}
