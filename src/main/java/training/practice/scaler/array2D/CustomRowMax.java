package training.practice.scaler.array2D;

/*Given a 2D array A[][] and row index B, return max of Bth row.*/
public class CustomRowMax {

	//get ith row max element
	public static int getRowMax(int[][] arr, int rowIndex){
		int max = Integer.MIN_VALUE;
		for(int j = 0;j<arr[rowIndex].length;j++){
			if(max<arr[rowIndex][j]){
				max = arr[rowIndex][j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		int rowIndex = 2;
		System.out.println(getRowMax(arr,rowIndex));
	}
}
