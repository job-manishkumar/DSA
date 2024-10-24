package training.practice.scaler.module3.array_1.assignment;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

	//approach 1 - using for loop
	public static int countFrequency(int[] arr, int b) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				count++;
			}
		}
		return count;
	}

	//approach 2 - using for hashMap
	//tc -> O(n) and sc -> O(n)
	public static int countFrequency_2(int[] arr, int b) {

		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		//iterate over map
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(entry.getKey() == b){
				return entry.getValue();
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {1, 1, 2, 4, 2};
		int b = 2;
		System.out.println(countFrequency(arr,b));
		System.out.println(countFrequency_2(arr,b));
	}
}
