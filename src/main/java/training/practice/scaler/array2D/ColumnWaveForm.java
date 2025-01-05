package training.practice.scaler.array2D;

import java.util.Scanner;

/*Write a program to input a integer N and a N*N matrix mat from user and print the matrix in wave from (column wise).*/
public class ColumnWaveForm {

	//get user input array[][]
	public static int[][] getUserInput() {
		System.out.println("enter row and column value or array");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("enter values for every row and column");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		return arr;
	}

	//get column wise wave form
	public static void printWaveForm(int[][] arr) {
		for (int j = 0; j < arr[arr.length - 1].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = getUserInput();
		printWaveForm(arr);
	}


}
