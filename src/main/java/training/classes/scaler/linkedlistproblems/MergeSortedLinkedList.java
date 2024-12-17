package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

@ToString
public class MergeSortedLinkedList {

	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node mergeLinkedList(Node h1, Node h2) {

		Node curr, head = null;
		if (h1 == null && h2 == null) {
			throw new IllegalArgumentException("Linked list are null");
		}
		if (h1.data > h2.data) {
			head = h2;
			curr = head;
			h2 = h2.next;
		} else {
			head = h1;
			curr = head;
			h1 = h1.next;
		}

		while (h1 != null && h2 != null) {
			if (h1.data > h2.data) {
				curr.next = h2;
				h2 = h2.next;
				curr = curr.next;
			} else {
				curr.next = h1;
				h1 = h1.next;
				curr = curr.next;
			}
		}
		if (h2 == null) {
			curr.next = h1;
		}
		if (h1 == null) {
			curr.next = h2;
		}
		return head;
	}


	public static void main(String[] args) {
		Node h1 = new Node(2);
		Node h2 = new Node(6);
		Node h3 = new Node(10);
		Node h4 = new Node(14);
		Node h5 = new Node(19);
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;

		Node n1 = new Node(3);
		Node n2 = new Node(5);
		Node n3 = new Node(9);
		Node n4 = new Node(11);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		//System.out.println(h1);
		//System.out.println(n1);
		System.out.println(mergeLinkedList(h1, n1));
	}
}
