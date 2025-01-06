package training.practice.scaler.array2D;

/*Given 2D array A[][] and column index B, return the sum of Bth column.*/
public class CustomColumnSum {

	public static int getColumnSum(int[][] arr, int index) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] arr = {{12, 65, 89, 74},
				{22, 44, 12, 30},
				{10, 12, 97, 19}};
		int b = 1;
		System.out.println(getColumnSum(arr, b));
	}
}
