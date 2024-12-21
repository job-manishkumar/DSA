package training.classes.scaler.stack;

import java.util.Stack;

public class MaxAreaInHistogram {

	public static int[] getNearestSmallestInLeft(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] leftRes = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.empty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				leftRes[i] = -1;
			} else {
				leftRes[i] = st.peek();
			}
			st.push(i);
		}
		return leftRes;
	}

	public static int[] getNearestSmallestOnRight(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] rightRes = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				rightRes[i] = arr.length;
			} else {
				rightRes[i] = st.peek();
			}
			st.push(i);
		}
		return rightRes;
	}

	public static int getMaxArea(int[] arr) {
		int[] resLeft = getNearestSmallestInLeft(arr);
		int[] resRight = getNearestSmallestOnRight(arr);

		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int height = arr[i];
			int width = resRight[i] - resLeft[i] - 1;
			int Area = height * width;
			maxArea = Math.max(maxArea, Area);
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] arr = {8, 6, 2, 5, 6, 5, 7, 4};
		System.out.println(getMaxArea(arr));
	}
}
