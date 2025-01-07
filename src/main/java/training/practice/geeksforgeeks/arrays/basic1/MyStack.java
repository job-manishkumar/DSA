package training.practice.geeksforgeeks.arrays.basic1;

public class MyStack {
	private int[] arr;
	private int top;

	public MyStack() {
		arr = new int[1000];
		top = -1;
	}

	public void push(int x) {
		// Your Code
		if (top == arr.length) {
			return;
		}
		top++;
		arr[top] = x;
	}

	public int pop() {
		if (top == -1) {
			return -1;
		}
		int value = arr[top];
		top--;
		return value;
	}

	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		st.push(4);
		System.out.println(st.pop());
	}

}
