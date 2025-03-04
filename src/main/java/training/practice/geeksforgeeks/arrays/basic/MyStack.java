package training.practice.geeksforgeeks.arrays.basic;

/*Write a program to implement a Stack using Array. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. The push() method takes one argument, an integer 'x' to be pushed into the stack and pop() which returns an integer present at the top and popped out from the stack. If the stack is empty then return -1 from the pop() method.

Note: The input is given in form of queries. Since there are two operations push() and pop(), there is two types of queries as described below:
(i) 1 x   (a query of this type means  pushing 'x' into the stack)
(ii) 2     (a query of this type means to pop an element from the stack and print the popped element)
Input contains separated by space and as described above. */
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
