package training.practice.geeksforgeeks.arrays.basic;

/*You are given an array arr and an integer k. In one operation you can choose any element of array and decrease its
value by k. You need find the minimum number of operation such that all the elements in the array becomes less or
equal to k.*/
public class ReducingWalls {

	//approach 1
	//tc -> O(n*d) and sc ->O(1)
	public static int countReducingWalls(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > k) {
				count++;
				arr[i] = arr[i] - k;
			}
		}
		return count;
	}

	//approach 2
	//tc -> O(n) and sc ->O(1)
	public static int countReducingWalls_2(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > k) {
				count += (arr[i] - k) / k + (((arr[i] - k) % k == 0) ? 0 : 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {25806};
		int k = 506;
		System.out.println(countReducingWalls(arr, k));
		int[] arr1 = {25806};
		System.out.println(countReducingWalls_2(arr1, k));
		String s = "";
		System.out.println(s.replace(" ", ","));


	}
}
