package training.classes.scaler.tree.bst;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class InsertValueInBST {


	@ToString
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node insertData(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data > root.data) {
			root.right = insertData(root.right, data);
		} else {
			root.left = insertData(root.left, data);
		}
		return root;
	}

	public static List<Integer> getInOrder(Node root, List<Integer> list) {
		if (root == null) {
			return null;
		}
		getInOrder(root.left, list);
		list.add(root.data);
		getInOrder(root.right, list);
		return list;
	}

	public static void main(String[] args) {
		Node root = new Node(15);
		Node n2 = new Node(10);
		Node n3 = new Node(21);
		Node n4 = new Node(5);
		Node n5 = new Node(27);
		Node n6 = new Node(1);
		Node n7 = new Node(8);
		Node n9 = new Node(24);
		Node n10 = new Node(34);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n3.right = n5;
		n4.left = n6;
		n4.right = n7;
		n5.left = n9;
		n5.right = n10;
		int data = 12;
		List<Integer> list = new ArrayList<>();
		System.out.println("tree data before adding node " + data + " is :\n" + getInOrder(root, list));
		insertData(root, data);
		List<Integer> list2 = new ArrayList<>();
		System.out.println("tree data after adding node " + data + " is :\n" + getInOrder(root, list2));

	}
}
