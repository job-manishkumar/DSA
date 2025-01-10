package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array arr, rotate the array by one position in clockwise direction.*/
public class RotateArrayByOne {

	//approach 1 -- using shifting array element
	public static void rotateArray(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
	}

	//approach 2  -- using reverse approach or general approach
	public static void rotateArray_2(int[] arr) {
		int rotateTime =1;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,rotateTime-1);
		reverse(arr,rotateTime,arr.length-1);

	}
	public static void reverse(int[] arr,int si,int ei){
		for(int i=si,j=ei;i<j;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		rotateArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("==========");
		int[] arr1 = {1, 2, 3, 4, 5};
		rotateArray_2(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
