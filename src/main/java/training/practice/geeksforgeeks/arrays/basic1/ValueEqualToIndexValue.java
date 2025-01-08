package training.practice.geeksforgeeks.arrays.basic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.*/
public class ValueEqualToIndexValue {

	public static List<Integer> equalToIndex(List<Integer> list){
			List<Integer> result = new ArrayList<>();
			for(int i=0;i<list.size();i++){
				if(i+1 == list.get(i)){
					result.add(list.get(i));
				}
			}
			return result;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15, 2, 45, 4 , 7);
		System.out.println(equalToIndex(list));
	}

}
