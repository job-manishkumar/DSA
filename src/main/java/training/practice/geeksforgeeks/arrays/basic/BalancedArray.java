package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

public class BalancedArray {

	//tc -> O(n) and sc ->(1)
	public static int balanceArray(List<Integer> arr) {
		int low = 0;
		int high = arr.size();
		int mid = low + ((high - low) / 2);

		int[] leftArray = new int[mid - low];
		int[] rightArray = new int[high - mid + 1];

		//inset value in left array
		int index = 0;
		for (int i = 0; i < mid; i++) {
			leftArray[index] = arr.get(i);
			index++;
		}
		//inset value in right array
		index = 0;
		for (int i = mid; i < high; i++) {
			rightArray[index] = arr.get(i);
			index++;
		}

		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < leftArray.length; i++) {
			rightSum += rightArray[i];
			leftSum += leftArray[i];
		}

		return Math.abs(rightSum - leftSum);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 3, 2);
		System.out.println(balanceArray(list));

	}


}
