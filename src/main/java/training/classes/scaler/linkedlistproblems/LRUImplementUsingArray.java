package training.classes.scaler.linkedlistproblems;

import java.util.Arrays;

public class LRUImplementUsingArray {


	//approach 1 using array
	//tc - > O(n) and sc-> O(n)
	static int[] lru = {};

	public static boolean search(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static void addElement(int[] arr, int x) {
		lru = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			lru[i] = arr[i];
		}
		lru[arr.length] = x;
	}

	public static void removeFirst(int[] arr, int x) {
		lru = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			lru[i] = arr[i + 1];
		}
	}


	public static int[] LRUImplement(int[] arr, int capacity) {
		for (int i = 0; i < arr.length; i++) {
			if (search(lru, arr[i])) {
				removeFirst(lru, arr[i]);
				addElement(lru, arr[i]);
			} else {
				if (lru.length == capacity) {
					removeFirst(lru, arr[i]);
					addElement(lru, arr[i]);
				} else {
					addElement(lru, arr[i]);
				}
			}
		}
		return lru;
	}

	public static void main(String[] args) {
		int capacity = 3;
		int[] a = {7, 3, 9, 10, 14, 9, 10, 15, 8, 14};
		System.out.println(Arrays.toString(LRUImplement(a, capacity)));

	}
}
