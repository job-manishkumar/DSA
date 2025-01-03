package training.practice.scaler.array;

/*Given an Array A[]. Check if it is Strictly Decreasing order or not. If Array is in Strictly Decreasing order,
return 1, otherwise return 0.*/
public class CheckDecreasingOrder {

	//check decreasing order
	//tc -> O(n) and sc -> O(1)
	public static int checkDecreasingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		int[] arr1 = {80, 70, 60, 60, 50, 40, 30, 20};
		System.out.println(checkDecreasingOrder(arr));
		System.out.println("===============");
		System.out.println(checkDecreasingOrder(arr1));
	}
}
