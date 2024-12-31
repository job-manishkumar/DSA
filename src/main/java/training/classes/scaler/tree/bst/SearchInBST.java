package training.classes.scaler.tree.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInBST {

	static List<Integer> list = new ArrayList<>();

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

	//approach 1 using -- converting tree to in-order array then search

	//tc -> O(n) and sc -> O(n)
	public static boolean search(Node root, int k) {
		List<Integer> list = getInOrderArray(root);
		if (list.contains(k)) {
			return true;
		}
		return false;
	}

	//approach 2 using in-order traversal and binary search
	//tc -> O(n) and sc -> O(n)
	public static boolean search_2(List<Integer> list, int k, int low, int high) {
		if (low > high) {
			return false;
		}
		int mid = low + ((high - low) / 2);
		if (k == list.get(mid)) {
			return true;
		}
		if (k > list.get(mid)) {
			return search_2(list, k, mid + 1, high);
		}
		return search_2(list, k, low, mid - 1);
	}

	public static List<Integer> getInOrderArray(Node root) {

		if (root == null) {
			return null;
		}
		getInOrderArray(root.left);
		list.add(root.data);
		getInOrderArray(root.right);
		return list;
	}

	//approach 3- direct search in BST
	//tc -> O(height of tree) and sc -> O(1)
	public static boolean search_3(Node root, int k) {

		if (root == null) {
			return false;
		}
		if (root.data == k) {
			return true;
		} else if (root.data > k) {
			return search_3(root.left, k);
		}
		return search_3(root.right, k);
	}


	public static void main(String[] args) {

		Node root = new Node(4);
		Node n2 = new Node(0);
		Node n3 = new Node(10);
		Node n4 = new Node(-1);
		Node n5 = new Node(3);
		Node n6 = new Node(7);
		Node n7 = new Node(15);
		Node n9 = new Node(6);
		Node n10 = new Node(9);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n6.left = n9;
		n6.right = n10;

		int k = 9;
		//int k = 11;
		System.out.println(search(root, k));
		System.out.println("===========");
		List<Integer> list = getInOrderArray(root);
		System.out.println(search_2(list, k, 0, list.size() - 1));
		System.out.println("=============");
		System.out.println(search_3(root, k));

	}
}
