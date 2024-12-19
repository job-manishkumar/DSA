package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

import java.util.HashMap;

public class LRUImplementUsingDoublyLinkedListAndHashMap {

	static Node head;
	static Node tail;

	static int size;


	public static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static void addElement(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.next = tail.next;
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public static void removeElement(int x) {
		Node temp = head;
		head = head.next;
		temp.next = null;
		head.prev = null;
		size--;
	}

	public static HashMap<Integer, Node> setValueInHashMap(Node node) {
		HashMap<Integer, Node> map = new HashMap<>();
		Node temp = node;
		while (temp != null) {
			map.put(temp.data, temp);
			temp = temp.next;
		}
		return map;
	}

	public static boolean search(int x) {
		if (head != null) {
			HashMap<Integer, Node> map = setValueInHashMap(head);
			if (map.get(x) != null) {
				return map.containsKey(map.get(x).data);
			}
		}
		return false;
	}

	public static Node LRUImplement(int[] arr, int capacity) {
		for (int i = 0; i < arr.length; i++) {
			if (search(arr[i])) {
				removeElement(arr[i]);
				addElement(arr[i]);
			} else {
				if (size == capacity) {
					removeElement(arr[i]);
					addElement(arr[i]);
				} else {
					addElement(arr[i]);
				}
			}
		}
		return head;
	}

	public static void printLinkedList(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		int capacity = 3;
		int[] a = {7, 3, 9, 10, 14, 9, 10, 15, 8, 14};
		Node n = LRUImplement(a, capacity);
		printLinkedList(n);
		//System.out.println(tail);
	}
}
