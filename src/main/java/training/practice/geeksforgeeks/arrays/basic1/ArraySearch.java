package training.practice.geeksforgeeks.arrays.basic1;

/*Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return
 the index of the first occurrence of x in the array, or -1 if it doesn't exist.*/
public class ArraySearch {

	public static int search(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10, 8, 30, 4, 5};
		int x = 5;
		System.out.println(search(arr, x));
	}
}
