package training.practice.scaler.introductiontoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the
given inclusive range [B, C].*/
public class ReverseInRange {

	//approach 1 == in place reverse
	public static List<Integer> reverseInRange(List<Integer> list, int b, int c) {
		for (int i = b, j = c; i < j; i++, j--) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int B = 2;
		int C = 3;
		System.out.println(reverseInRange(list, B, C));
	}
}
