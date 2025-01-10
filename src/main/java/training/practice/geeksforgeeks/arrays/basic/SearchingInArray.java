package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.List;

/*Given an integer k and array arr. Your task is to return the position of the first occurrence of k in the given
array and if element k is not present in the array then return -1.

Note: 1-based indexing is followed here.*/
public class SearchingInArray {

	public static int searchFirstOccurrence(List<Integer> list, int k) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == k) {
				return (i + 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 7, 16, 16, 4);
		int k = 16;
		System.out.println(searchFirstOccurrence(list, k));
	}
}
