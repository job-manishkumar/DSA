package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

public class LRUImplementUsingLinkedList {

	static Node head;
	static Node tail;

	@ToString
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static boolean search(int x) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void addElement(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public static void removeElement(int x) {
		Node temp = head;
		head = head.next;
		temp.next = null;
	}

	public static int countLength(Node node) {
		Node temp = node;
		int count = 0;
		while (temp != null) {
			count = count + 1;
			temp = temp.next;
		}
		return count;
	}

	public static Node LRUImplement(int[] arr, int capacity) {
		for (int i = 0; i < arr.length; i++) {
			if (search(arr[i])) {
				removeElement(arr[i]);
				addElement(arr[i]);
			} else {
				if (countLength(head) == capacity) {
					removeElement(arr[i]);
					addElement(arr[i]);
				} else {
					addElement(arr[i]);
				}
			}
		}
		return head;
	}

	public static void main(String[] args) {
		int capacity = 3;
		int[] a = {7, 3, 9, 10, 14, 9, 10, 15, 8, 14};
		System.out.println(LRUImplement(a, capacity));
		//System.out.println(tail);
	}
}
