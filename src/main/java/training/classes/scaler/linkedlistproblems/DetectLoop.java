package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

import java.util.HashSet;

public class DetectLoop {

	//@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//approach 1 using hash map or hashset
	//tc -> O(n) and sc ->O(N)
	public static boolean checkLoop(Node node) {
		Node temp = node;
		HashSet<Node> set = new HashSet<>();
		while (temp != null) {
			if (set.contains(temp)) {
				return true;
			}
			set.add(temp);
			temp = temp.next;
		}
		return false;
	}

	//approach 2 -- using fast and slow approach
	// tc -> O(n) and sc -> O(1)
	public static boolean checkLoop_2(Node node) {
		Node slow = node;
		Node fast = node;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}

		}
		return false;
	}


	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(4);
		Node n4 = new Node(9);
		Node n5 = new Node(8);
		Node n6 = new Node(16);
		Node n7 = new Node(25);
		Node n8 = new Node(30);
		Node n9 = new Node(17);
		Node n10 = new Node(500);
		Node n11 = new Node(98);
		Node n12 = new Node(48);
		Node n13 = new Node(100);
		Node n14 = new Node(200);
		Node n15 = new Node(7);
		Node n16 = new Node(300);
		Node n17 = new Node(400);
		Node n18 = new Node(27);

		//linked the node
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		n15.next = n16;
		n16.next = n17;
		n17.next = n18;
		n18.next = n9;

		System.out.println(checkLoop(n1));
		System.out.println(checkLoop_2(n1));

	}
}
