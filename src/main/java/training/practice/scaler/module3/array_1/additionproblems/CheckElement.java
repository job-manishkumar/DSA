package training.practice.scaler.module3.array_1.additionproblems;

public class CheckElement {

	//tc -> O(n) and sc -> O(1)
	public static boolean isPresent(int[] arr, int b) {
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

	public static void main(String[] args) {

		/*int[] arr= {4,1,5,9,1};
		int b = 5;*/
		int[] arr = {7, 7, 2};
		int b = 1;
		System.out.println(isPresent(arr, b));
	}
}
