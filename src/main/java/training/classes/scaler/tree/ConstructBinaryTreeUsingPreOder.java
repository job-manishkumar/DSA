package training.classes.scaler.tree;

import lombok.ToString;

@ToString
public class ConstructBinaryTreeUsingPreOder {

	static int index = -1;

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

	public static Node constructTree(int[] arr) {

		index = index + 1;
		if (arr[index] == -1) {
			return null;
		}
		Node root = new Node(arr[index]);
		root.left = constructTree(arr);
		root.right = constructTree(arr);
		return root;
	}

	public static void main(String[] args) {
		int[] preOrder = {3, 2, 12, -1, -1, -1, 6, 10, 14, -1, -1, -1, 9, 1, 19, -1, -1, -1, 12, -1, 8, -1, 17, -1,
				-1};
		System.out.println(constructTree(preOrder));
	}
}
