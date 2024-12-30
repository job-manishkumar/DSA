package training.classes.scaler.tree.traversal;

public class PostOrder {

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

	public static void printInOrder(Node root) {

		if (root != null) {
			printInOrder(root.left);
			printInOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		Node root = new Node(3);
		Node n1 = new Node(2);
		Node n2 = new Node(12);
		Node n3 = new Node(6);
		Node n4 = new Node(10);
		Node n5 = new Node(14);
		Node n6 = new Node(9);
		Node n7 = new Node(1);
		Node n8 = new Node(19);
		Node n9 = new Node(12);
		Node n10 = new Node(8);
		Node n11 = new Node(17);


		//construct tree
		root.left = n1;
		n1.left = n2;
		root.right = n3;
		n3.left = n4;
		n4.left = n5;
		n3.right = n6;
		n6.left = n7;
		n7.left = n8;
		n6.right = n9;
		n9.right = n10;
		n10.right = n11;

		//System.out.println(root);
		printInOrder(root);


	}
}
