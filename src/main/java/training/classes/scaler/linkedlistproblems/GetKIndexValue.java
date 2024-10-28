package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class GetKIndexValue {

	//approach 1
	//tc -> O(n) and sc(1)
	public static int getIndexValue(Node head, int k) {
		Node temp = head;
		int count = 0;
		while (count < k) {
			temp = temp.next;
			count++;
		}
		return temp.data;
	}

	public static void main(String[] args) {

		//create linked list
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.println(n1);
		int k = 4;
		System.out.println(getIndexValue(n1, k));

	}
}

@ToString
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
