package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern11 {

	public static void printPattern(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(j + 1);
				} else {
					System.out.print((char) (j + 65));
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
