package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an array arr of even size, the task is to find a minimum value that can be added to an element so that the
array becomes balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of
 the right half.*/
public class BalancedArray {

	//tc ->O(n) and sc->O(1)
	public static int addValue(List<Integer> list) {
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < list.size() / 2; i++) {
			leftSum += list.get(i);
		}
		for (int i = list.size() / 2; i < list.size(); i++) {
			rightSum += list.get(i);
		}
		return Math.abs(leftSum - rightSum);
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 3, 2);
		System.out.println(addValue(list));
	}
}
