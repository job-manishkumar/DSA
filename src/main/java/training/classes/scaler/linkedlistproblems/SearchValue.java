package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class SearchValue {

	//approach 1
	//tc -> O(n) and sc ->(1)
	public static boolean searchItem(Node head, int val) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == val) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		//create Node and linked List

		Node head = new Node(23);
		Node n2 = new Node(14);
		Node n3 = new Node(23);
		Node n4 = new Node(9);
		Node n5 = new Node(8);
		Node n6 = new Node(3);

		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		int val = 24;
		System.out.println(searchItem(head, val));
		;
	}
}

