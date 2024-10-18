package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern6 {

	public static void printPattern6(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		printPattern6(row);
		scanner.close();
	}
}
