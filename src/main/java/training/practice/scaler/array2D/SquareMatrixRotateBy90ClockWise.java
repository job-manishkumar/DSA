package training.practice.scaler.array2D;

import java.util.Arrays;

/*You are given a N*N matrix A representing an image. Rotate the image by 90 degrees (clockwise).*/
public class SquareMatrixRotateBy90ClockWise {

	//get transpose
	//tc -> O(n2) and sc-> O(1)
	public static int[][] getRotateBy90(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(Arrays.deepToString(getRotateBy90(arr)));
	}
}
