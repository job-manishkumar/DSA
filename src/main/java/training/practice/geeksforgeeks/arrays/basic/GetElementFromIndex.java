package training.practice.geeksforgeeks.arrays.basic;

public class GetElementFromIndex {


	//tc - >O(1) and sc-> O(1)
	public static int getElement(int[] arr, int index) {
		return arr[index];
	}

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int index = 4;
		System.out.println(getElement(a, index));

	}
}
