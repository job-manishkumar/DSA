package training.classes.scaler.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftView {

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

	//tc -> O(n) and sc ->O(n)
	public static List<Integer> leftViewTraversal(Node root) {
		Queue<Node> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				if (i == 0) {
					list.add(node.data);
				}
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(5);
		Node n5 = new Node(8);
		Node n6 = new Node(10);
		Node n7 = new Node(13);
		Node n8 = new Node(6);
		Node n9 = new Node(9);
		Node n10 = new Node(7);
		Node n11 = new Node(4);
		Node n12 = new Node(12);
		Node n13 = new Node(11);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n6.left = n9;
		n6.right = n10;
		n7.right = n11;
		n9.left = n12;
		n9.right = n13;
		System.out.println(leftViewTraversal(root));
	}
}
