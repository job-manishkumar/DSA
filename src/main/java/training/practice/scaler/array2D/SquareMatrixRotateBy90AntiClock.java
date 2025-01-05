package training.practice.scaler.array2D;

import java.lang.reflect.Array;
import java.util.Arrays;

/*You are given a N*N matrix A representing an image. Rotate the image by 90 degrees (Anti-clockwise).*/
public class SquareMatrixRotateBy90AntiClock {

	public static void rotateBy90(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			for (int si = 0, ei = arr.length - 1; si < ei; si++, ei--) {
				int temp = arr[si][j];
				arr[si][j] = arr[ei][j];
				arr[ei][j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		rotateBy90(arr);
		System.out.println(Arrays.deepToString(arr));
	}
}
