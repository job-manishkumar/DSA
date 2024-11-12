package training.practice.geeksforgeeks.arrays.basic;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {

	//approach 1 -- using loops
	// tc -> O(n2) and sc ->O(1)
	public static int findUnique(int[] arr){

		boolean[] isVisited = new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
			int count =1;
			if(isVisited[i]){
				continue;
			}
			for(int j = i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
					isVisited[j] = true;
				}
			}
			if(count==1){
				return arr[i];
			}
		}
		return -1;
	}

	//approach 2 -- using hashmap
	//tc -> O(n) and sc ->O(n)
	public static int findUnique_2(int[] arr){

		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		//iteration of map
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(entry.getValue()==1){
				return entry.getKey();
			}
		}
		return -1;
	}

	//approach 3
	/*public static int findUnique_3(int[] arr){

	}*/


	public static void main(String[] args) {

		int[] arr = {6, 2, 5, 2, 2, 6, 6};
		//int[] arr = {2, 2, 2, 10, 2};
		System.out.println(findUnique(arr));
		System.out.println(findUnique_2(arr));
	}

}
