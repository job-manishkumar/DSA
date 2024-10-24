package training.practice.scaler.module3.array_1.additionproblems;

public class FindPosition {

	//tc -> O(n) and sc -> O(1)
	public static int findPosition(int[] arr,int b){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == b){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//int[] arr = {12,26,25,21,18,10,45,40,29,30};
		//int b = 40;
		int[] arr = {12,28,23,21,18,15,14,40,12,30,10,19};
		int b = 45;
		System.out.println(findPosition(arr,b));
	}
}
