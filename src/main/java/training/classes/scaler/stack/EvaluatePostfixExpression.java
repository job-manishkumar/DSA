package training.classes.scaler.stack;

import java.util.Stack;

public class EvaluatePostfixExpression {

	public static int evaluateExpression(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/' || c[i] == '%') {
				int y = st.pop();
				int x = st.pop();
				switch (c[i]) {
					case '+':
						st.push(x + y);
						break;
					case '-':
						st.push(x - y);
						break;
					case '*':
						st.push(x * y);
						break;
					case '/':
						st.push(x / y);
						break;
					case '%':
						st.push(x % y);
						break;
				}
			} else {
				st.push(Integer.parseInt(String.valueOf(c[i])));
			}
		}
		return st.peek();
	}

	static Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		String str = "35+2-25*-";
		System.out.println(evaluateExpression(str));
	}
}
