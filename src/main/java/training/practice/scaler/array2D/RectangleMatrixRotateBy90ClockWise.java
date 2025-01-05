package training.practice.scaler.array2D;

import java.util.Arrays;

/*You are given a N*N matrix A representing an image. Rotate the image by 90 degrees (clockwise).*/
public class RectangleMatrixRotateBy90ClockWise {


	//tc  -> O(n2) and sc -> O(n2)
	public static int[][] transpose(int[][] arr) {
		int[][] result = new int[arr[arr.length - 1].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result[j][i] = arr[i][j];
			}
		}
		return result;
	}

	public static int[][] swap(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int si = 0, ei = arr[i].length - 1; si < ei; si++, ei--) {
				int temp = arr[i][si];
				arr[i][si] = arr[i][ei];
				arr[i][ei] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.deepToString(swap(transpose(arr))));
	}
}
