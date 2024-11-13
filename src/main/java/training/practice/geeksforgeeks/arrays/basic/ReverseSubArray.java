package training.practice.geeksforgeeks.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSubArray {

	//tc -> O(n) and sc -> O(1)
	public static ArrayList<Integer> reverseSubArray1Index(ArrayList<Integer> list, int l, int r){

		for(int i=l-1,j=r-1;i<j;i++,j--){
			int temp = list.get(i);
			list.set(i,list.get(j));
			list.set(j,temp);
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		for(int i:arr){
			list.add(i);
		}
		int l = 2;
		int r = 4;
		System.out.println(reverseSubArray1Index(list,l,r));

	}
}
