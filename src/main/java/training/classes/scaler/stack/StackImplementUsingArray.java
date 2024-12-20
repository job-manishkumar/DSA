package training.classes.scaler.stack;

import lombok.ToString;

@ToString
public class StackImplementUsingArray {

	int[] arr = new int[10];
	int top = -1;

	public void push(int x) {
		if (arr.length - 1 == top) {
			throw new StackOverflowError("stack over flow");
		}
		top++;
		arr[top] = x;
	}

	public int pop() {
		if (top == -1) {
			throw new StackOverflowError("stack under flow");
		}
		int val = arr[top];
		top--;
		return val;
	}

	public int peek() {
		if (top == -1) {
			throw new StackOverflowError("stack under flow");
		}
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		StackImplementUsingArray st = new StackImplementUsingArray();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.pop());
		st.push(40);
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		st.pop();
		st.pop();
		st.pop();
		//st.pop();
		System.out.println(st);
	}
}
