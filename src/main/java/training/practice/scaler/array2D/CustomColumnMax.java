package training.practice.scaler.array2D;

/*Given 2D Array A[][ and column index B, return max of Bth column.*/
public class CustomColumnMax {

	//get ith column max element
	public static int getCustomColumnElement(int[][] arr,int columnIndex){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i][columnIndex]){
				max = arr[i][columnIndex];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		int columnIndex = 1;
		System.out.println(getCustomColumnElement(arr,columnIndex));
	}
}
