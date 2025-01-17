package training.practice.scaler.prefixsum;

import java.util.Arrays;

/*Given an array A of N integers. Construct prefix sum of the array in the given array itself.*/
public class InPlacePrefixSum {

	public static void inPlacePrefixSum(int[] arr){
		for(int i=1;i<arr.length;i++){
			arr[i]+=arr[i-1];
		}
	}
	public static void main(String[] args) {
		int[] arr ={1, 3, 6, 10, 15};
		inPlacePrefixSum(arr);
		System.out.println(Arrays.toString(arr));
	}
}
