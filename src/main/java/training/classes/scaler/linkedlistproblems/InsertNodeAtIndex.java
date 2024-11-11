package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class InsertNodeAtIndex {

	public static Node insertNode(Node head,int val,int index){

		Node temp = head;
		Node newNode = new Node(val);
		for(int i=0;i<index-1 && temp.next!=null;i++){
			temp = temp.next;
		}
		if(index==0){
			newNode.next = head;
			head = newNode;
		}
		else if(temp.next==null){
			temp.next = newNode;
		}
		else{
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return head;
	}


	@ToString
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
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
		//value and index for new node
		int val = 60;
		//int index = 3;
		//insert in beginning
		//int index =0;

		//inset in last
		int index =10;
		System.out.println(insertNode(head,val,index));;

	}
}
