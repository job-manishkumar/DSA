package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

public class MultiplyLeftAndRightArraySum {

	//tc -> O(n) and sc -> O(1)
	public static int getMultiplySubArray(int[] arr) {
		int low = 0;
		int high = arr.length;
		int mid = low + ((high - low) / 2);
		int[] leftArray = new int[mid - low];
		int[] rightArray = new int[high - mid];

		//insert data in left array
		int index = 0;
		for (int i = low; i < mid; i++) {
			leftArray[index] = arr[i];
			index++;
		}

		//insert data in right array
		index = 0;
		for (int i = mid; i < high; i++) {
			rightArray[index] = arr[i];
			index++;
		}

		//left array sum
		int leftSum = 0;
		for (int i = 0; i < leftArray.length; i++) {
			leftSum += leftArray[i];
		}

		//right array sum
		int rightSum = 0;
		for (int i = 0; i < rightArray.length; i++) {
			rightSum += rightArray[i];
		}

		return leftSum * rightSum;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(getMultiplySubArray(a));
		;
	}
}
