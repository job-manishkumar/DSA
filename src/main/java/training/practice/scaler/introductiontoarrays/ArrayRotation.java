package training.practice.scaler.introductiontoarrays;

import java.util.Arrays;
import java.util.List;

/*Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times
towards the right.*/
public class ArrayRotation {

	//approach 1-- using shift array element
	//tc -> O(n2) and sc -> O(1)
	public static List<Integer> rotation(List<Integer> list, int b) {
		for (int i = 0; i < b; i++) {
			int temp = list.get(0);
			for (int j = 1; j < list.size(); j++) {
				list.set(j - 1, list.get(j));
			}
			list.set(list.size() - 1, temp);
		}
		return list;
	}

	//approach 2
	//tc -> O(n) and sc -> O(1)
	public static List<Integer> rotation_2(List<Integer> list, int b) {
		if (b > list.size()) {
			b = b % list.size();
		}
		reverse(list, 0, list.size() - 1);
		reverse(list, 0, b - 1);
		reverse(list, b, list.size() - 1);
		return list;
	}

	public static void reverse(List<Integer> list, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int b = 2;
		System.out.println(rotation(list, b));
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		System.out.println(rotation_2(list2, b));
	}
}
