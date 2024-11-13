package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;
import java.util.Spliterator;

public class SmallestAndSecondSmallest {

	//tc -> O(n) and sc -> O(1)
	public static int[] findSmallAndSecondSmall(int[] arr){
		int small= Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<small){
				secondSmall = small;
				small = arr[i];
			}
			if(arr[i]<secondSmall && arr[i]!=small){
				secondSmall = arr[i];
			}
		}
		if(secondSmall == Integer.MAX_VALUE){
			return new int[]{-1};
		}
		return new int[]{small,secondSmall};
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 6};
		//int[] arr = {1,1,1};
		System.out.println(Arrays.toString(findSmallAndSecondSmall(arr)));
	}
}
