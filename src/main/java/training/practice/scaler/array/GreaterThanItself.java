package training.practice.scaler.array;

/*Given an array A of N integers. Count the number of elements that have at least 1 element  greater than itself.*/
public class GreaterThanItself {

	//tc -> O(n) and sc -> O(1)
	public static int greaterThanItself(int[] arr) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		// find the max value
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// check all the value which are less than max
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {3, 3, 2};
		System.out.println(greaterThanItself(arr));


	}
}
