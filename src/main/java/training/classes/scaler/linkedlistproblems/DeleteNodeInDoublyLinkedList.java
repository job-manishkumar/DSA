package training.classes.scaler.linkedlistproblems;

public class DeleteNodeInDoublyLinkedList {

	public static class Node{
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static Node removeNodeByIndex(Node node,int index){
		Node temp = node;
		for(int i=0;i<index;i++){
			temp = temp.next;
		}
		if(index ==0){
			node = temp.next;
			node.prev =null;
			temp.next= null;
			return node;
		}
		temp.prev.next = temp.next;
		if(temp.next!=null) {
			temp.next.prev = temp.prev;
		}
		temp.next = null;
		temp.prev =null;
		return node;
	}

	public static Node removeNodeByValue(Node node,int value){
		Node temp = node;
		while(temp!=null){
			if(temp.data == value){
				if(temp == node){
					node = temp.next;
					node.prev =null;
					temp.next= null;
					return node;
				}
				temp.prev.next = temp.next;
				if(temp.next!=null) {
					temp.next.prev = temp.prev;
				}
				temp.next = null;
				temp.prev =null;
				return  node;
			}
			temp = temp.next;
		}
		return node;
	}


	public static void printLinkedList(Node node){
		while(node !=null){
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

		/*printLinkedList(head);
		System.out.println("=================");
		Node n = removeNodeByIndex(head,4);
		printLinkedList(n);
		System.out.println("==================");*/
		Node h = removeNodeByValue(head,20);
		printLinkedList(h);


	}
}
