package training.classes.scaler.stack;

import java.util.Stack;

public class CheckValidParentheses {

	static Stack<Character> st = new Stack<>();

	public static boolean isValidParentheses(String str) {
		char[] c = str.toCharArray();
		if (c.length % 2 != 0) {
			return false;
		}
		for (int i = 0; i < c.length; i++) {
			if (st.isEmpty() || c[i] == '(' || c[i] == '{' || c[i] == '[') {
				st.push(c[i]);
			} else if (c[i] == ')') {
				char c1 = st.peek();
				if (c1 != '(') {
					return false;
				}
				st.pop();
			} else if (c[i] == '}') {
				char c1 = st.peek();
				if (c1 == '{') {
					st.pop();
				} else {
					st.push(c[i]);
				}
			} else if (c[i] == ']') {
				char c1 = st.peek();
				if (c1 == '[') {
					st.pop();
				} else {
					st.push(c[i]);
				}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		String str = "()[]";
		System.out.println(isValidParentheses(str));


	}
}
