package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

public class SwapKthElement {

	public static void swapKElement(int k, List<Integer> list) {

		if (k > list.size()) {
			throw new IllegalArgumentException("swap size can not be greater than array length");

		}
		//get element in array from beginning
		int firstElementIndex = k - 1;
		//get element from last
		int secondElementIndex = list.size() - k;

		//swap first and second element
		int temp = list.get(firstElementIndex);
		list.set(firstElementIndex, list.get(secondElementIndex));
		list.set(secondElementIndex, temp);

	}

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		//int k =3;
		List<Integer> list = Arrays.asList(5, 3, 6, 1, 2);
		int k = 2;
		swapKElement(k, list);
		System.out.println(list);

	}
}
