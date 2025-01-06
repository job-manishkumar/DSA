package training.practice.scaler.array2D;

/*Given 2D Array A[][] and row index B, return sum of Bth row*/
public class CustomRowSum {


	//tc -> O(n) and sc -> (1)
	public static int rowSum(int[][] arr, int index) {
		int sum = 0;
		if (index <= arr.length) {
			for (int j = 0; j < arr[arr.length - 1].length; j++) {
				sum += arr[index][j];
			}
			return sum;
		}
		throw new IllegalArgumentException("index is greater than now");
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		int index = 2;
		System.out.println(rowSum(arr, index));
	}
}
