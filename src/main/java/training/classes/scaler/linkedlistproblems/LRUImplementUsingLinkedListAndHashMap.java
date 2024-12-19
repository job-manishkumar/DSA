package training.classes.scaler.linkedlistproblems;

import lombok.ToString;

import java.util.HashMap;

public class LRUImplementUsingLinkedListAndHashMap {

	static Node head;
	static Node tail;

	static int size;

	@ToString
	public static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static HashMap<Integer,Node> setValueInHashMap(Node node){
		HashMap<Integer,Node> map = new HashMap<>();
		Node temp  = node;
		while(temp!=null){
			map.put(temp.data,temp);
			temp = temp.next;
		}
		return map;
	}

	public static boolean search(int x){
		HashMap<Integer, Node> map = setValueInHashMap(head);
		Node node = map.get(x);
		if(node!=null){
			return map.containsKey(node.data);
		}
		return false;
	}

	public static void addElement(int x){
		Node newNode = new Node(x);
		if(head == null){
			head = newNode;
			tail = newNode;
			size++;
		}
		else{
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public static void removeElement(int x){
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;

	}

	public static Node LRUImplement(int[] arr, int capacity){
		for(int i=0;i<arr.length;i++){
			if(search(arr[i])){
				removeElement(arr[i]);
				addElement(arr[i]);
			}
			else{
				if(size == capacity){
					removeElement(arr[i]);
					addElement(arr[i]);
				}
				else {
					addElement(arr[i]);
				}
			}
		}
		return head;
	}

	public static void main(String[] args) {
		int capacity = 3;
		int[] a = {7, 3, 9, 10, 14, 9, 10, 15, 8, 14};
		System.out.println(LRUImplement(a,capacity));
		//System.out.println(tail);

	}
}
