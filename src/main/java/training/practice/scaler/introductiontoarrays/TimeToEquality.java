package training.practice.scaler.introductiontoarrays;

/*Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.*/
public class TimeToEquality {

	public static int equalityTime(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr[i]; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int calculateTime = 0;
		for (int i = 0; i < arr.length; i++) {
			calculateTime = calculateTime + (max - arr[i]);
		}
		return calculateTime;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 3, 2};
		System.out.println(equalityTime(arr));
	}

}
