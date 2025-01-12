package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Mr. Geek is a greedy seller. He has a stock of some laptops comprising both useful and useless laptops. Now, he
wants to organize a sale to clear his stock of useless laptops. The prices of laptops are arri each consisting of
positive and negative integers (-ve denoting useless laptops). In a day, he can sell almost m laptops. Mr. Geek, a
greedy seller, wants to earn maximum profit from this sale and sell useless laptops. So, help him maximize his profit
 by selling useless laptops.*/
public class MegaSale {

	//approach 1
	//tc -> O(nlogn) and sc -> O(1)
	public static int getMaxProfit(int[] arr, int m) {
		Arrays.sort(arr);
		int countNegativeElement = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countNegativeElement++;
			}
		}
		m = Math.min(m, countNegativeElement);
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += arr[i];
		}
		return Math.abs(sum);
	}

	public static void main(String[] args) {
		int[] arr = {1, -2, -3, -4, 5};
		int m = 2;
		System.out.println(getMaxProfit(arr, m));
	}
}
