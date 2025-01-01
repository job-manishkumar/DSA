package training.classes.scaler.tree.bst;

import java.util.ArrayList;
import java.util.List;

public class GetMaximumValue {

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

	//approach 1 - using in-order traversal
	//tc ->O(n) and sc -> O(n)
	public static int getMaximumValue(Node root) {
		List<Integer> list = new ArrayList<>();
		list = getInOrder(root, list);
		if (!list.isEmpty()) {
			return list.get(list.size() - 1);
		}
		return -1;
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

	//approach 2 - using tree traversal
	//tc -> O(height of tree) and sc ->(1)
	public static Node getMaximumValue_2(Node root) {
		if (root == null) {
			return null;
		}
		while (root.right != null) {
			root = root.right;
		}
		return root;
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
		System.out.println(getMaximumValue(root));
		System.out.println(getMaximumValue_2(root).data);
	}
}
