package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern1 {

	public static void printPattern(int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter row and column value");
		int row = scanner.nextInt();
		int column = scanner.nextInt();

		printPattern(row, column);


	}
}
