package training.practice.scaler.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a dynamic array A. Return a Dynamic Array that has all even number from A.*/
public class FindAllEvenNumbers {

	//get all even numbers from arraylist
	//tc -> O(n)  and sc -> O(n)
	public static List<Integer> getEvenNumbers(List<Integer> list) {
		List<Integer> evenList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				evenList.add(list.get(i));
			}
		}
		return evenList;
	}

	// for java version 8 onward
	public static List<Integer> getEvenNumbers_2(List<Integer> list) {
		return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(getEvenNumbers(list));
		System.out.println("==============");
		System.out.println(getEvenNumbers_2(list));

	}
}
