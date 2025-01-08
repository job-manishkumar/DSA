package training.practice.geeksforgeeks.arrays.basic1;

import java.util.HashMap;
import java.util.Map;

/*Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[]. Both arrays are not sorted, and elements are distinct.*/
public class ArraySubset {

	//tc -> O(n) and sc ->O(n)
	public static boolean isArraySubset(int[] arr,int[] brr){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		for(int i=0;i<brr.length;i++){
			if(!map.containsKey(brr[i])){
				return false;
			}
			int freq = map.get(brr[i]);
			if(freq<1){
				return false;
			}
			map.put(brr[i],map.get(brr[i])-1);
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {11, 7, 1, 13, 21, 3, 3};
		int[] brr = {11, 3, 7, 1, 7};
		System.out.println(isArraySubset(arr,brr));
	}
}
