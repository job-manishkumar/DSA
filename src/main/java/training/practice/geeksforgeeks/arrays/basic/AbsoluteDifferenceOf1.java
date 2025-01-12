package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;

/*Given an array arr. Return all the numbers less than k and the number which have at least two digits and the
absolute difference between every adjacent digit of that number should be 1 in the array.

Note: Return an empty list if no such number is present.*/
public class AbsoluteDifferenceOf1 {

	//approach 1
	// tc -> O(n*d) and sc -> O(n)
	public static ArrayList<Integer> findDifference(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < k && arr[i] > 9) {
				String s = String.valueOf(arr[i]);
				boolean correctDifference = true;
				char[] ch = s.toCharArray();
				for (int j = 0; j < ch.length - 1; j++) {
					int diff = ch[j] - ch[j + 1];
					if (Math.abs(diff) != 1) {
						correctDifference = false;
					}
				}
				if (correctDifference) {
					list.add(arr[i]);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		/*int[] arr = {7, 98, 56, 43, 45, 23, 12, 8};
		int k = 54;*/
		int[] arr = {87, 89, 45, 235, 465, 765, 123, 987, 499, 655};
		int k = 1000;
		System.out.println(findDifference(arr, k));
	}
}
