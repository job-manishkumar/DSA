package training.classes.scaler.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/*Misha loves eating candies. She has been given N boxes of Candies.
She decides that every time she will choose a box having the minimum number of candies, eat half of the candies and put the remaining candies in the other box that has the minimum number of candies.
Misha does not like a box if it has the number of candies greater than B so she won't eat from that box. Can you find how many candies she will eat?

NOTE 1: If a box has an odd number of candies then Misha will eat the floor(odd / 2).

NOTE 2: The same box will not be chosen again.*/
public class MishaAndCandies {

	//tc-> O(n*nlogn) and sc -=> O(1)
	public static int countEat(int[] arr, int b) {
		int totalEat = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			Arrays.sort(arr);
			int halfEat = 0;
			if (arr[i] <= b) {
				halfEat = arr[i] / 2;
				int remainingValue = arr[i] - halfEat;
				arr[i + 1] = arr[i + 1] + remainingValue;
			}
			totalEat += halfEat;
		}
		return totalEat;
	}

	//approach 2
	public static int countEat_2(int[] arr, int b) {
		PriorityQueue<Integer> p = new PriorityQueue<>();// min queue
		int totalEat = 0;
		for (int i = 0; i < arr.length; i++) {
			p.add(arr[i]);
		}
		for (int i = 0; i < p.size(); i++) {
			int minValue = p.remove();
			int half = 0;
			if (minValue <= b) {
				half = minValue / 2;
				int remainingValue = minValue - half;
				p.add(p.remove() + remainingValue);
			}
			totalEat += half;
		}
		return totalEat;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 3};
		int b = 4;
		System.out.println(countEat(arr, b));
		int[] arr2 = {3, 2, 3};
		System.out.println("2 option:"+countEat_2(arr2,b));
		System.out.println("==========");
		int[] arr1 = {1, 2, 1};
		int b1 = 2;
		System.out.println(countEat(arr1, b1));
		int[] arr4 = {1, 2, 1};
		System.out.println("2 option:"+countEat_2(arr4,b1));
	}
}
