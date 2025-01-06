package training.practice.scaler.string;

/*Write a program to return a string from a given string s where all occurrences of the first char of the string except the first occurrence have been changed to ‘$’.*/
public class ReplaceOtherOccurrence {

	public static String replaceOtherOccurrence(String str) {
		StringBuilder sb = new StringBuilder().append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			char firstChar = str.charAt(0);
			char otherChar = str.charAt(i);
			if (firstChar == otherChar) {
				sb.append("$");
			} else {
				sb.append(otherChar);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "restart";
		//String str = "manishkumar";
		System.out.println(replaceOtherOccurrence(str));
	}
}
