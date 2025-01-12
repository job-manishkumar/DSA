package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;

/*Given an unsorted array arr[] and two elements num1 and num2. The task is to count the number of elements that
occur between the given elements (excluding num1 and num2). If there are multiple occurrences of num1 and num2, we
need to consider the leftmost occurrence of num1 and the rightmost occurrence of num2.*/
public class CountNumberOfElementsBetweenTwoGivenElementsInArray {

	//approach 1
	//tc -> O(n) and sc ->O(1)
	public static int countElement(ArrayList<Integer> list, int num1, int num2) {
		int num1Index = -1;
		int num2Index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == num1) {
				num1Index = i;
				break;
			}
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == num2) {
				num2Index = i;
				break;
			}
		}
		return Math.max((num2Index - num1Index - 1), 0);
	}

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 10, 6};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		int num1 = 4;
		int num2 = 6;
		System.out.println(countElement(list, num1, num2));
	}
}
