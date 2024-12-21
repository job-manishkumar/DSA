package training.classes.scaler.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElementOnLeft {

	//approach 1 using loop
	//tc -> O(n2) and sc -> O(n)
	public static int[] getNearestSmallestElement(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					result[i] = arr[j];
					break;
				}
			}
		}
		return result;
	}

	//approach 2 - using stack
	//tc -> O(n) and sc -> O(n)
	public static int[] getNearestSmallestElement_2(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && st.peek() >= arr[i]) {
				st.pop();
			}
			if (st.empty()) {
				result[i] = -1;
			} else {
				result[i] = st.peek();
			}
			st.push(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {4, 6, 10, 11, 7, 8, 3, 5};
		System.out.println(Arrays.toString(getNearestSmallestElement(arr)));
		System.out.println("===============");
		System.out.println(Arrays.toString(getNearestSmallestElement_2(arr)));
	}
}
