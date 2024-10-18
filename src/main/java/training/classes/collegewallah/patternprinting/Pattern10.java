package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern10 {

	public static void printPattern(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + 65));
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
