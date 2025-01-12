package training.practice.geeksforgeeks.arrays.basic;

/*Calculate the product of all the elements in an array.*/
public class MultiplyArray {

	//approach
	//tc -> O(n) and sc -> (1)
	public static int calculateProduct(int[] arr, int n) {
		int product = 1;
		for (int i = 0; i < n; i++) {
			product = product * arr[i];
		}
		return product;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1};
		int n = 5;
		System.out.println(calculateProduct(arr, n));
	}
}
