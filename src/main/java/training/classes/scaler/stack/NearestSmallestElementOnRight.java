package training.classes.scaler.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElementOnRight {

	//approach 1 using loop
	// tc -> O(n2) and sc -> O(n)
	public static int[] getNearestSmallestElement(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					res[i] = arr[j];
					break;
				}
			}
		}
		return res;
	}

	//approach 2 using stack
	//tc -> O(n) and sc -> O(n)
	public static int[] getNearestSmallestElement_2(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.empty() && st.peek() > arr[i]) {
				st.pop();
			}
			if (st.empty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}
			st.push(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {4, 6, 10, 11, 7, 8, 3, 5};
		System.out.println(Arrays.toString(getNearestSmallestElement(arr)));
		System.out.println("===========");
		System.out.println(Arrays.toString(getNearestSmallestElement_2(arr)));
	}
}
