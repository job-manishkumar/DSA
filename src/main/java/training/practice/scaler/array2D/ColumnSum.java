package training.practice.scaler.array2D;

import java.util.Arrays;

/*Given a 2D Array A[][], return sum of every column in an array.*/
public class ColumnSum {

	public static int[] getColumnSum(int[][] arr){
		int[] result = new int[arr[arr.length-1].length];
		for(int j=0;j<arr[arr.length-1].length;j++){
			int sum = 0;
			for(int i=0;i<arr.length;i++){
				sum +=arr[i][j];
			}
			result[j]= sum;
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.toString(getColumnSum(arr)));
	}
}
