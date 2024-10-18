package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern12 {

	public static void printPattern(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j == row / 2 || i == row / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int row = scanner.nextInt();
		printPattern(row);

		scanner.close();
	}

}
