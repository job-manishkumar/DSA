package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/*Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest
and the second element is the smallest, the third element is the second largest and the fourth element is the second
smallest, and so on.*/
public class AlternativeSorting {

	//approach 1 -- using two pointer approach
	//tc -> O(nlogn) and sc -> O(n)
	public static ArrayList<Integer> alternateSorting(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j = arr.length - 1;
		for (int k = 0; k < arr.length; k++) {
			if (k % 2 == 0) {
				list.add(arr[j]);
				j--;
			} else {
				list.add(arr[i]);
				i++;
			}
		}
		return list;
	}

	//approach 2 -- using heap or priority queue(min and max both)
	//tc -> O(nlogn) and sc -> O(n)
	public static ArrayList<Integer> alternateSorting_2(int[] arr) {
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			p1.add(arr[i]);
		}
		PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			p2.add(arr[i]);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				list.add(p2.remove());
			} else {
				list.add(p1.remove());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 2, 3, 4, 5, 6};
		System.out.println(alternateSorting(arr));
		System.out.println(alternateSorting_2(arr));
	}
}
