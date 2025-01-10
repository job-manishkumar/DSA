package training.practice.geeksforgeeks.arrays.basic;

/*Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return
true else return false.

An array is said to be palindrome if its reverse array matches the original array. */
public class PalindromeArray {

	// approach 1 -- reverse array and match every element of array
	//tc -> O(n) and sc -> O(n)
	public static boolean isPalindrome(int[] arr) {
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[arr.length - 1 - i];
		}
		//check both element
		for (int i = 0; i < arr.length; i++) {
			if (brr[i] != arr[i]) {
				return false;
			}
		}
		return true;
	}

	//approach 2
	//tc ->O(n) and sc ->O(1)
	public static boolean isPalindrome_2(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1};
		System.out.println(isPalindrome(arr));
		System.out.println(isPalindrome_2(arr));
	}
}
