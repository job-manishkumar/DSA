package training.classes.scaler.tree;

import lombok.ToString;

@ToString
public class ConstructBinaryTreeUsingPostOrder {

	static int index;

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

	public static Node constructTee(int[] arr) {
		index = index - 1;
		if (arr[index] == -1) {
			return null;
		}
		Node root = new Node(arr[index]);
		root.right = constructTee(arr);
		root.left = constructTee(arr);


		return root;
	}

	public static void main(String[] args) {
		int[] postOrder = {-1, -1, 12, -1, 2, -1, -1, 14, -1, 10, -1, -1, 19, -1, 1, -1, -1, -1, -1, 17, 8, 12, 9, 6,
				3};
		index = postOrder.length;
		System.out.println(constructTee(postOrder));
	}
}
