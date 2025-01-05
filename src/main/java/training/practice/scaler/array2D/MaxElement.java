package training.practice.scaler.array2D;

/*Given a 2D Array A[][], return max element from this matrix.*/
public class MaxElement {

	//if array is not sorted
	public static int getMaxElement(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {10, 11, 12}, {7, 8, 9}};
		System.out.println(getMaxElement(arr));
	}

}
