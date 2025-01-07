package training.classes.scaler.heap;

import java.util.ArrayList;
import java.util.List;

public class BuildHeap {

	public static List<Integer> buildHeap(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			upheapify(list, list.size() - 1);
		}
		return list;
	}

	private static void upheapify(List<Integer> list, int c) {
		int p = (c - 1) / 2;
		while (p >= 0 && list.get(p) > list.get(c)) {
			int temp = list.get(p);
			list.set(p, list.get(c));
			list.set(c, temp);
			c = p;
			p = (c - 1) / 2;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 13, -2, 11, 27, 31, 0, 19};
		System.out.println(buildHeap(arr));
	}
}
