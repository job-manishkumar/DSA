package training.practice.scaler.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumber {

	//get positive numbers
	public static List<Integer> getPositiveNumber(List<Integer> arr) {
		List<Integer> result = new ArrayList<>();
		for (int i : arr) {
			if (i > 0) {
				result.add(i);
			}
		}
		return result;
	}

	//using streams
	public static List<Integer> getPositiveNumber_2(List<Integer> list) {
		return list.stream().filter(i -> i > 0).collect(Collectors.toList());
	}


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 6, 8 - 2, -8, 0, 5);
		System.out.println(getPositiveNumber(list));
		System.out.println("===================");
		System.out.println(getPositiveNumber_2(list));
	}
}
