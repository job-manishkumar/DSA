package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class ReverseLinkedList {
	

	@ToString
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next =null;
		}
	}
	
	
	public static Node reverseList(Node node){
		
		Node curr,temp; Node rev = null;
		temp = node;
		while(temp!=null){
			curr = temp;
			temp= temp.next;
			curr.next = rev;
			rev = curr;
		}
		node = rev;
		return  node;
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
		System.out.println(head);
		System.out.println(reverseList(head));
	}
}
