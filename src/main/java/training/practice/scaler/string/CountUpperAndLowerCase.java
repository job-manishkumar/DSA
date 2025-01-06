package training.practice.scaler.string;

import java.util.Scanner;

/*Write a program to input a String str from user and print count of uppercase and lowercase letters in it.*/
public class CountUpperAndLowerCase {

	public static String getUserData() {
		System.out.println("enter any string with has uppercase and lower case value");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		return str;
	}

	public static void printCountCase(String str) {
		char[] ch = str.toCharArray();
		int lowerCount = 0;
		int upperCount = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 123) {
				lowerCount++;
			}
			if (ch[i] >= 65 && ch[i] <= 91) {
				upperCount++;
			}
		}
		System.out.println("lower case count: " + lowerCount + " and upper case count: " + upperCount);
	}

	public static void main(String[] args) {
		printCountCase(getUserData());
	}
}
