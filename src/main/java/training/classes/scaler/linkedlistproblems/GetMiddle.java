package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

@ToString
public class GetMiddle {

	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//approach 1
	// tc -> O(n) and sc -> (1)
	public static int getMid(Node node) {
		Node temp = node;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		Node tempNode = node;
		if (count % 2 != 0) {
			for (int i = 0; i < count / 2; i++) {
				tempNode = tempNode.next;
			}
			return tempNode.data;
		} else {
			for (int i = 0; i < count / 2 - 1; i++) {
				tempNode = tempNode.next;
			}
			return tempNode.data;
		}
	}

	// approach 2 using fast and slow pointer
	public static int getMid_2(Node node) {
		Node slow = node;
		Node fast = node;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		Node n2 = new Node(3);
		Node n3 = new Node(7);
		Node n4 = new Node(8);
		Node n5 = new Node(5);
		Node n6 = new Node(4);
		Node n7 = new Node(11);
		Node n8 = new Node(16);

		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		System.out.println(head);
		System.out.println(getMid(head));
		System.out.println("=============");
		System.out.println(getMid_2(head));
	}
}
