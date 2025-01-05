package training.practice.scaler.array2D;

/*Given a 2D array A[][], return min element from this matrix.*/
public class MinElement {

	//get min element
	public static int getMinElement(int[][] arr){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(min>arr[i][j]){
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		System.out.println(getMinElement(arr));
	}
}
