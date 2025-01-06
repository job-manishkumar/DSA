package training.practice.scaler.array2D;

import java.util.Arrays;

/*You are given two matrices A and B of same size, you have to return another matrix which is the sum of A and B.*/
public class MatrixSum {

	public static int[][] sum(int[][] a, int[][] b) {
		int[][] sum = new int[a.length][a[a.length - 1].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(Arrays.deepToString(sum(a,b)));
	}
}
