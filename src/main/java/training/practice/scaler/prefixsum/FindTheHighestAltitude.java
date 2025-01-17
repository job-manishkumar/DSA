package training.practice.scaler.prefixsum;

/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker
starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1
for all (0 <= i < n). Return the highest altitude of a point.*/
public class FindTheHighestAltitude {

	//approach 1
	public static int findAltitude(int[] arr) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			result[i + 1] = result[i] + arr[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < result.length; i++) {
			if (max < result[i]) {
				max = result[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {-5, 1, 5, 0, -7};
		System.out.println(findAltitude(arr));
	}
}
