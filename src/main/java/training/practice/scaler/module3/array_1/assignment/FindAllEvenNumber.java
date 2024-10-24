package training.practice.scaler.module3.array_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllEvenNumber {

	//approach 1 - using array
	//tc -> O(n) and sc -> O(n)
	public static int[] getAllEvenNumbers(int[] arr) {
		int countEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			}
		}
		int[] result = new int[countEven];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[index] = arr[i];
				index++;
			}
		}
		return result;
	}

	//approach 2 -- using arrayList
	public static List<Integer> getAllEvenNumbers_2(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int[] arr = {8, 54, 79, 62, 33, 59, 14, 19, 20, 27};
		//int[] arr = {31,38,36,45,48,47,44,26};
		System.out.println(Arrays.toString(getAllEvenNumbers(arr)));
		System.out.println(getAllEvenNumbers_2(arr));
	}
}
