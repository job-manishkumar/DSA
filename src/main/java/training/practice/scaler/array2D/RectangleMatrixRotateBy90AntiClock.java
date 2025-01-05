package training.practice.scaler.array2D;

import java.util.Arrays;

/*You are given a N*N matrix A representing an image. Rotate the image by 90 degrees (Anti-clockwise).*/
public class RectangleMatrixRotateBy90AntiClock {

	public static int[][] rotateBy90(int[][] arr) {
		int[][] result = new int[arr[arr.length - 1].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result[j][i] = arr[i][j];
			}
		}
		for (int j = 0; j < result[result.length - 1].length; j++) {
			for (int si = 0, ei = result.length - 1; si < ei; si++, ei--) {
				int temp = result[si][j];
				result[si][j] = result[ei][j];
				result[ei][j] = temp;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.deepToString(rotateBy90(arr)));

	}
}
