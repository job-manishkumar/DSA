package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class MegaSale {

	//tc -> O(nlogn) and sc -> O(1)
	public static int getMaxProfit(int[] arr1, int m) {
		Arrays.sort(arr1);
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				count++;
			}
		}
		count = m > count ? count : m;
		int profit = 0;
		for (int i = 0; i < count; i++) {
			profit += arr1[i];
		}
		return Math.abs(profit);
	}

	public static void main(String[] args) {
		/*int[] arr = {-6, 0, 35, 4};
		int m = 3;*/
		int[] arr = {1, -2, -3, -4, 5};
		int m =2;
		System.out.println(getMaxProfit(arr, m));
	}
}
