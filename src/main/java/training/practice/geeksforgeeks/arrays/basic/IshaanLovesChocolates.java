package training.practice.geeksforgeeks.arrays.basic;

/*As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares.
 Each of the squares has a tastiness level which is denoted by an array A[].
Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too
and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first.
Determine the tastiness level of the square which his sister gets.*/
public class IshaanLovesChocolates {

	//similar question -> find smallest element in array

	//tc -> O(n) and sc ->O(1)
	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 6, 9};
		System.out.println(findMin(arr));
	}
}
