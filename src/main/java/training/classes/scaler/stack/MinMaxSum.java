package training.classes.scaler.stack;

import java.util.Arrays;
import java.util.Stack;

public class MinMaxSum {

	//approach 1 using loop
	// tc -> O(N3) and sc -> O(1)
	public static int getMinMaxSubArraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int minValue = Integer.MAX_VALUE;
				int maxValue = Integer.MIN_VALUE;
				for (int k = i; k <= j; k++) {
					if (minValue > arr[k]) {
						minValue = arr[k];
					}
					if (maxValue < arr[k]) {
						maxValue = arr[k];
					}
				}
				int diff = maxValue - minValue;
				sum = sum + diff;
			}

		}
		return sum;
	}

	public static int getMinMaxSubArraySum_2(int[] arr) {
		int[] nsl = getNearestSmallestIndexOnLeft(arr);
		int[] nsr = getNearestSmallestIndexOnRight(arr);
		int[] ngl = getNearestGreatestIndexOnLeft(arr);
		int[] ngr = getNearestGreatestIndexOnRight(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int maxCountElement = (i - ngl[i]) * (ngr[i] - i);
			int minCountElement = (i - nsl[i]) * (nsr[i] - i);
			sum = sum + arr[i] * (maxCountElement - minCountElement);
		}
		return sum;

	}

	public static int[] getNearestSmallestIndexOnLeft(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}
			st.push(i);
		}
		return res;
	}

	public static int[] getNearestSmallestIndexOnRight(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = arr.length;
			} else {
				res[i] = st.peek();
			}
			st.push(i);
		}
		return res;
	}

	public static int[] getNearestGreatestIndexOnLeft(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}
			st.push(i);
		}
		return res;
	}

	public static int[] getNearestGreatestIndexOnRight(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = arr.length;
			} else {
				res[i] = st.peek();
			}
			st.push(i);
		}
		return res;
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(getMinMaxSubArraySum(arr));
		System.out.println("=================");
		System.out.println(getMinMaxSubArraySum_2(arr));
	}
}
