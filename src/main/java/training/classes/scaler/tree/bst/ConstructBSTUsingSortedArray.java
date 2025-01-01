package training.classes.scaler.tree.bst;

import lombok.ToString;

@ToString
public class ConstructBSTUsingSortedArray {

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

	//approach 1 using recursion
	public static Node constructBST(int[] arr) {
		Node node = null;
		for (int i : arr) {
			node = insertInBST(node, i);
		}
		return node;
	}

	public static Node insertInBST(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (value > root.data) {
			root.right = insertInBST(root.right, value);
		} else {
			root.left = insertInBST(root.left, value);
		}
		return root;
	}

	//approach 2
	//tc -> O(height of tree) and sc -> O(n)
	public static Node constructBST(int[] arr, int low, int high) {
		Node root = null;
		if (low <= high) {
			int mid = low + ((high - low) / 2);
			root = new Node(arr[mid]);
			root.left = constructBST(arr, low, mid - 1);
			root.right = constructBST(arr, mid + 1, high);
		}
		return root;
	}


	public static void main(String[] args) {
		int[] arr = {-1, 3, 4, 6, 7, 8, 10, 13, 14};
		System.out.println(constructBST(arr));
		System.out.println("=================");
		System.out.println(constructBST(arr, 0, arr.length - 1));
	}
}
