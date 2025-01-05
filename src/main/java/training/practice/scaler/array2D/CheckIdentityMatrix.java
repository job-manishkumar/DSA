package training.practice.scaler.array2D;

/*You are given a N*N square matrix A. You have to tell whether A is an identity matrix or not. Identity matrix is special square matrix whose main diagonal elements are equal to 1 and other element are 0.*/
public class CheckIdentityMatrix {

	public static boolean isIdentityMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][i] != 1) {
					return false;
				} else if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		System.out.println(isIdentityMatrix(arr));
	}
}
