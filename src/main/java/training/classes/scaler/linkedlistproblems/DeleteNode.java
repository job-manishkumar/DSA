package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class DeleteNode {

	//make node as inner class
	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node deleteNode(Node head,int data){
		Node temp = head;
		if(temp.data ==data){
			head = head.next;
			return head;
		}
		while(temp.next!=null){
			if(temp.next.data == data){
				temp.next = temp.next.next;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}


	public static void main(String[] args) {
		Node head = new Node(10);
		Node n2 = new Node(6);
		Node n3 = new Node(4);
		Node n4 = new Node(8);
		Node n5 =new Node(9);
		Node n6 = new Node(14);
		head.next =n2;
		n2.next = n3;
		n3.next= n4;
		n4.next= n5;
		n5.next = n6;
		System.out.println(deleteNode(head,4));
		System.out.println(deleteNode(head,10));
		System.out.println(deleteNode(head,14));

	}

}
