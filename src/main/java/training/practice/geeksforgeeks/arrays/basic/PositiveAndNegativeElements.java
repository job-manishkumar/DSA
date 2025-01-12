package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr containing equal number of positive and negative elements, arrange the array such that every
positive element is followed by a negative element.
Note: The relative order of positive and negative numbers should be maintained.*/
public class PositiveAndNegativeElements {

	//approach 1
	public static ArrayList<Integer> arrangeElements(ArrayList<Integer> arr) {
		ArrayList<Integer> positiveList = new ArrayList<>();
		ArrayList<Integer> negativeList = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positiveList.add(arr.get(i));
			} else {
				negativeList.add(arr.get(i));
			}
		}
		//re-arrange
		for (int i = 0; i < positiveList.size(); i++) {
			result.add(positiveList.get(i));
			result.add(negativeList.get(i));
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {-1, 2, -3, 4, -5, 6};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(arrangeElements(list));
	}
}
