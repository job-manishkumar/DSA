package training.practice.geeksforgeeks.arrays.basic;

/*You are given an integer array arr[]. The task is to find the sum of it.*/
public class SumOfArray {

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(sumArray(arr));
	}
}
