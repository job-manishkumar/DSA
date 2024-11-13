package training.practice.geeksforgeeks.arrays.basic;

public class CountPairSum {

	//approach 1
	//tc -> O(n2) and sc -> O(1)
	public static int countPair(int[] arr1,int[] arr2,int x){
		int count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]+arr2[j]==x){
					count++;
				}
			}
		}
		return count;
	}

	//approach2
	//tc -> O(n2) and sc -> O(1)
	public static int countPair_2(int[] arr1,int[] arr2,int x){
		int count= 0;
		for(int i=0;i<arr1.length;i++){
			int secondElement = x-arr1[i];
			for(int j=0;j<arr2.length;j++){
				if(secondElement == arr2[j]){
					count++;
				}
			}
		}
		return count;
	}

	//approach 3  using two pointer approach
	//tc -> O(n) and sc->O(1)
	public static int countPair_3(int[] arr1,int[] arr2,int x){
		int count=0;
		int i =0;
		int j = arr2.length-1;
		while(i<arr1.length && j>=0)
		{
			if(arr1[i]+arr2[j] == x){
				count++;
				i++;
				j--;
			}
			else if(arr1[i]+arr2[j]>x){
				j--;
			}
			else{
				i++;
			}
		}
		return count;
	}



	public static void main(String[] args) {
		/*int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 3, 5, 8};
		int x = 10;*/

		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 6, 7, 8};
		int x = 5;
		System.out.println(countPair(arr1,arr2,x));
		System.out.println(countPair_2(arr1,arr2,x));
		System.out.println(countPair_3(arr1,arr2,x));
	}
}
