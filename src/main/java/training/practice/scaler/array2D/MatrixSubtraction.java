package training.practice.scaler.array2D;

import java.util.Arrays;


/*You are given two integer matrices A and B having same size, you have to subtract matrix B from A and return the resultant matrix.*/
public class MatrixSubtraction {

	public static int[][] subtraction(int[][] a,int[][] b){
		int[][] sub = new int[a.length][a[a.length-1].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				sub[i][j] = a[i][j]-b[i][j];
			}
		}
		return sub;
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		int[][] b = {{9, 8, 7},
				{6, 5, 4},
				{3, 2, 1}};

		System.out.println(Arrays.deepToString(subtraction(a,b)));
	}
}
