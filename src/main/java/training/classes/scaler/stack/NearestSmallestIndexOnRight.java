package training.classes.scaler.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestIndexOnRight {

	//approach 1 - using loop
	public static int[] getNearestSmallestIndex(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					res[i] = j;
					break;
				}
			}
		}
		return res;
	}

	//approach 2 using stack
	public static int[] getNearestSmallestIndex_2(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
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

	public static void main(String[] args) {
		int[] arr = {4, 6, 10, 11, 7, 8, 3, 5};
		System.out.println(Arrays.toString(getNearestSmallestIndex(arr)));
		System.out.println("============");
		System.out.println(Arrays.toString(getNearestSmallestIndex_2(arr)));
	}
}
