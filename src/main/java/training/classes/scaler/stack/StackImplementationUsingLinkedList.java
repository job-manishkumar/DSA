package training.classes.scaler.stack;

import lombok.ToString;

@ToString
public class StackImplementationUsingLinkedList {

	Node head;

	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public int pop() {
		if (head == null) {
			throw new StackOverflowError("Stack under flow");
		}
		Node temp = head;
		int val = temp.data;
		head = head.next;
		temp.next = null;
		return val;
	}

	public int peek() {
		if (head == null) {
			throw new StackOverflowError("Stack under flow");
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) {

		StackImplementationUsingLinkedList st = new StackImplementationUsingLinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		//System.out.println(st);
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
