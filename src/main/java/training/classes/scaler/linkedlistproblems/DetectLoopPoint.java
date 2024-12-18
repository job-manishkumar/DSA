package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

import java.util.HashSet;

public class DetectLoopPoint {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}

	//approach using hashset
	// tc -> O(n) and sc -> O(n)
	public static Node getLoopStartingPoint(Node node) {
		Node temp = node;
		HashSet<Node> set = new HashSet<>();
		while (temp != null) {
			if (set.contains(temp)) {
				return temp;
			}
			set.add(temp);
			temp = temp.next;
		}
		return null;
	}


	public static Node detectLoop(Node node) {
		Node slow = node;
		Node fast = node;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	// approach 2 using slow and fast pointer
	public static Node getLoopStartingPoint_2(Node node){

		Node temp = node;
		Node meetPointer = detectLoop(node);
		//System.out.println(meetPointer);
		if(meetPointer == null){
			return node;
		}
		while(temp!=meetPointer){
			temp = temp.next;
			meetPointer = meetPointer.next;
		}
		return temp;
	}

	public static void main(String[] args) {

		Node n1 = new Node(3);
		Node n2 = new Node(9);
		Node n3 = new Node(7);
		Node n4 = new Node(2);
		Node n5 = new Node(8);
		Node n6 = new Node(4);
		Node n7 = new Node(16);
		Node n8 = new Node(26);
		Node n9 = new Node(96);
		Node n10 = new Node(94);
		Node n11 = new Node(400);
		Node n12 = new Node(200);
		Node n13 = new Node(213);
		Node n14 = new Node(100);
		Node n15 = new Node(500);
		Node n16 = new Node(250);
		Node n17 = new Node(175);
		Node n18 = new Node(32);

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
		n18.next = n12;
		System.out.println(getLoopStartingPoint(n1));
		System.out.println(getLoopStartingPoint_2(n1));

	}
}
