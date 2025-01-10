package training.practice.geeksforgeeks.arrays.basic;

/*Given an array arr[] representing the size of candles which is reduced by 1 unit each day. The room is illuminated
using all the the present candles. Find the maximum number of days the room will stay illuminated (at least one
candle is having size greater than 0)*/
public class FightingTheDarkness {

	//same as find the max number in array
	//tc -> O(n) and sc ->O(1)
	public static long findLastCandle(int[] arr) {
		long lastCandle = Long.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (lastCandle < arr[i]) {
				lastCandle = arr[i];
			}
		}
		return lastCandle;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 2};
		System.out.println(findLastCandle(arr));
	}
}
