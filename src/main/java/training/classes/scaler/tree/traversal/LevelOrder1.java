package training.classes.scaler.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder1 {

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

	//tc -> O(n) and sc-> O(n)
	public static void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.data + " ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	public static void main(String[] args) {

		Node root = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(11);
		Node n6 = new Node(19);
		Node n7 = new Node(7);
		Node n8 = new Node(25);
		Node n9 = new Node(-3);
		Node n10 = new Node(45);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n4.left = n7;
		n5.right = n8;
		n6.left = n9;
		n6.right = n10;
		levelOrderTraversal(root);


	}
}
