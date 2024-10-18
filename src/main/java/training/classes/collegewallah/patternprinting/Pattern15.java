package training.classes.collegewallah.patternprinting;

import java.util.Scanner;

public class Pattern15 {

	public static void printPattern(int row) {

		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				k++;
				System.out.print(k);
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
