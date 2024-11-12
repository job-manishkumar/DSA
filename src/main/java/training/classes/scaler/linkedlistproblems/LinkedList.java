package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

/* need to make a custom class linked list which has below functionalities
1. search
2. getKth Index value
3. insert node
4. delete node
5. size of linked list

	*/

//@ToString
public class LinkedList {

	private Node head;
	private Node temp;

	private int size;

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

	//search function for linked list
	public boolean contains(int data) {
		temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void add(int data, int index) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			if (index > size) {
				index = size;
			}
			temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		size++;

	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}

	public Node removeData(int data) {
		if (head == null) {
			throw new IllegalArgumentException("Linked list is null");
		}
		if (head.data == data) {
			head = head.next;
			size--;
			return head;
		} else {
			temp = head;

			while (temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
					size--;
					return head;
				}
				temp = temp.next;
			}
		}
		return head;
	}

	public Node removeIndex(int index) {
		if (head == null) {
			throw new IllegalArgumentException("Linked list is null");
		}
		if (index == 0) {
			head = head.next;
			size--;
			return head;
		} else {
			temp = head;
			index = Math.min(index, size);
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
			return head;
		}
	}

	public int getKthIndexValue(int index) {
		temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString(){
		temp = head;
		StringBuilder sb = new StringBuilder("[");
		while(temp!=null){
			sb.append(temp.data).append(",");
			temp = temp.next;
		}
		String s = sb.substring(0,sb.length()-1);
		return s.concat("]");
	}
}
