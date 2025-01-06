package training.practice.scaler.string;

/*Write a program to input T String str from user and print count of vowels and consonants in it.*/
public class CountVowelsAndConsonant {

	public static void printCountVowelsAndConsonant(String str) {
		int countVowels = 0;
		int countConsonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				countVowels++;
			} else if (c >= 97 && c <= 123) {
				countConsonant++;
			}
		}
		System.out.println("vowels :" + countVowels + " and consonant: " + countConsonant);
	}

	public static void main(String[] args) {
		String str = "Hello World";
		printCountVowelsAndConsonant(str);
	}
}
