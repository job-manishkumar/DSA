package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;

public class CountNumberBwtTwoElement {

	//tc -> O(n) and sc -> O(1)
	public static int countNumbers(ArrayList<Integer> arr, int num1, int num2) {
		int startIndex = -1;
		int endIndex = -1;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == num1) {
				startIndex = i;
				break;
			}
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			if (arr.get(i) == num2) {
				endIndex = i;
				break;
			}
		}
		return startIndex > endIndex ? 0 : (endIndex - startIndex - 1);
	}

	public static void main(String[] args) {
		//int[] arr = {4, 2, 1, 10, 6};
		int[] arr = {3, 2, 1, 4};

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		/*	int num1 = 4;
			int num2 = 6;*/
		int num1 = 4;
		int num2 = 2;
		System.out.println(countNumbers(list, num1, num2));
	}
}
