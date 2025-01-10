package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*Given an array arr of integers which may or may not contain duplicate elements. Your task is to remove duplicate
elements.*/
public class RemoveDuplicatesFromUnsortedArray {

	//approach 1 -- using hashSet
	public static ArrayList<Integer> removeDuplicateOccurrence(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return new ArrayList<>(set);
	}


	public static void main(String[] args) {
		int[] arr = {19, 19, 11, 17, 15, 15, 20, 11, 10, 17, 17, 15, 18, 16, 17, 13, 17, 19};
		System.out.println(removeDuplicateOccurrence(arr));
		/*String s = "19 19 11 17 15 15 20 11 10 17 17 15 18 16 17 13 17 19";
		System.out.println(s.replace(" ",","));*/
	}
}
