package training.practice.geeksforgeeks.arrays.basic;

public class ArraySearch {

	//TC -> O(N) & SC -> O(1)
	public static int searchElement(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {10, 8, 30, 4, 5};
		int x = 5;
		System.out.println("element found in index = "+searchElement(a, x));
	}
}
