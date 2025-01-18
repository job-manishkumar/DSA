package training.practice.geeksforgeeks.arrays.basic;

import java.util.Arrays;

/*Given an array arr of even size consisting of positive integers. After sorting the array, find the sum of the
product of i-th element from starting and i-th element from last.*/
public class SumOfAlternateProduct {

	//approach 1
	public static int alternateProduct(int[] arr) {
		Arrays.sort(arr);
		int productSum = 0;
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int product = 1;
			if (i % 2 == 0) {
				product = arr[i] * arr[j];
			} else {
				product = arr[i] * arr[j];
			}
			productSum += product;
		}
		return productSum;
	}

	//approach 2  -- instead of for loop we will use while loop
	public static int alternateProduct_2(int[] arr) {
		Arrays.sort(arr);
		int productSum = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int product = arr[i] * arr[j];
			productSum += product;
			i++;
			j--;
		}
		return productSum;
	}


	public static void main(String[] args) {
		int[] arr = {9, 2, 8, 4, 5, 7, 6, 0};
		System.out.println(alternateProduct(arr));
		System.out.println(alternateProduct_2(arr));
	}
}
