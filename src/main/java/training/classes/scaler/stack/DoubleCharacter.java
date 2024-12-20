package training.classes.scaler.stack;

import java.util.Stack;

public class DoubleCharacter {

	static Stack<Character> st = new Stack<>();

	//tc -> O(n) and sc -> O(n)
	public static String removeDoubleCharacter(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (st.isEmpty() || st.peek() != c[i]) {
				st.push(c[i]);
			} else {
				st.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String str = "abbcbbcacx";
		System.out.println(removeDoubleCharacter(str));
	}
}
