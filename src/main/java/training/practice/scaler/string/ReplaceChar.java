package training.practice.scaler.string;


/*Given a String A of length N and a character B , replace all occurrences of B in string A with character ‘@’.*/
public class ReplaceChar {

	// approach 1-- without in-build function replace
	public static String replaceChar(String str, char c) {
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				sb.append("@");
			} else {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}


	//approach 2 -- using in-build function
	public static String replaceChar_2(String str, char c){
		return str.replace('o','@');
	}
	public static void main(String[] args) {
		String str = "hello world";
		char c = 'o';
		System.out.println(replaceChar(str,c));
		System.out.println("==============");
		System.out.println(replaceChar_2(str,c));
	}
}
