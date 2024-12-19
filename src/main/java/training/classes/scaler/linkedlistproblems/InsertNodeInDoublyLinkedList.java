package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class InsertNodeInDoublyLinkedList {
	public static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

		@Override
		public String toString() {
			return "Node{" +
					"data=" + data +
					'}';
		}
	}

	// tc -> O(n) and sc -> O(1)
	public static Node addNode(Node node, int index, int data) {

		Node newNode = new Node(data);
		Node temp = node;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		if (index == 0) {
			newNode.next = temp;
			temp.prev = newNode;
			temp = newNode;
			return temp;
		} else {
			newNode.next = temp.next;
			newNode.prev = temp;
			if (temp.next != null) {
				temp.next.prev = newNode;
			}
			temp.next = newNode;
		}
		return node;

	}

	public static void printLinkedList(Node node) {

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);

		head.next = n2;
		n2.next = n3;
		n2.prev = head;
		n3.next = n4;
		n3.prev = n2;
		n4.next = n5;
		n4.prev = n3;
		n5.next = null;
		n5.prev = n4;

		Node temp = addNode(head, 0, 100);
		printLinkedList(temp);

	}
}
