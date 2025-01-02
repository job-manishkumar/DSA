package training.classes.scaler.tree.bst;

import lombok.ToString;

@ToString
public class DeleteNodeInBST {

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

	public static Node deleteValue(Node root, int value) {
		if (root == null) {
			return null;
		}
		if (value > root.data) {
			root.right = deleteValue(root.right, value);
		} else if (value < root.data) {
			root.left = deleteValue(root.left, value);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left != null && root.right == null) {
				return root.left;
			} else if (root.right != null && root.left == null) {
				return root.right;
			} else {
				Node temp = root.left;
				while (temp.right != null) {
					temp = temp.right;
				}
				root.data = temp.data;
				root.left = deleteValue(root.left, temp.data);
			}
		}
		return root;
	}

	public static void main(String[] args) {

		Node root = new Node(35);
		Node n2 = new Node(20);
		Node n3 = new Node(41);
		Node n4 = new Node(10);
		Node n5 = new Node(30);
		Node n6 = new Node(51);
		Node n7 = new Node(5);
		Node n9 = new Node(47);
		Node n10 = new Node(60);
		Node n11 = new Node(45);
		Node n12 = new Node(48);
		Node n13 = new Node(55);
		Node n14 = new Node(70);
		Node n15 = new Node(46);
		Node n16 = new Node(75);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n4.left = n7;
		n6.left = n9;
		n6.right = n10;
		n9.left = n11;
		n9.right = n12;
		n10.left = n13;
		n10.right = n14;
		n11.right = n15;
		n14.right = n16;
		System.out.println(root);
		System.out.println(deleteValue(root, 51));
		//System.out.println(deleteValue(root,30));

	}
}
