package training.practice.scaler.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a program that return the list of elements that are present in the given list and are divisible by 5 and 7*/
public class GetDivisibleList {

	//get list of divisible from 5 and 7.
	public static List<Integer> getList(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 5 == 0 && list.get(i) % 7 == 0) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	//java 8 onward
	public static List<Integer> getList_2(List<Integer> list) {
		return list.stream().filter(i -> (i % 5 == 0 && i % 7 == 0)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 5, 7, 35, 40, 70);
		System.out.println(getList(list));
		System.out.println("============");
		System.out.println(getList_2(list));
	}


}
