package training.practice.geeksforgeeks.arrays.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/*Given an array arr. Your task is to find the minimum and maximum elements in the array.
Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a
maximum.*/
public class MinAndMaxInArray {

	@ToString
	@Getter
	@AllArgsConstructor
	public static class Pair<K, V> {
		private final K key;
		private final V value;
	}

	public static Pair<Integer, Integer> getArrayMinMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return new Pair<>(min, max);
	}

	//approach 2  -- using sorting
	//tc -> O(nlogn)
	public static Pair<Integer, Integer> getArrayMinMax_2(int[] arr) {
		Arrays.sort(arr);
		return new Pair<>(arr[0],arr[arr.length-1]);
	}


	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 56, 10000, 167};
		System.out.println(getArrayMinMax(arr));
	}


}
