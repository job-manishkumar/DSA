package training.classes.scaler.tree.traversal;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomView {

	@Setter
	@Getter
	public static class Pair {
		int index;
		Node node;

		Pair(int index, Node node) {
			this.index = index;
			this.node = node;
		}
	}

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

	public static void bottomViewTraversal(Node root) {

		Map<Integer, Node> map = new HashMap<>();
		Queue<Pair> queue = new LinkedList<>();
		int minIndex = Integer.MAX_VALUE;
		int maxIndex = Integer.MIN_VALUE;
		queue.add(new Pair(0, root));
		while (!queue.isEmpty()) {
			Pair pair = queue.poll();
			if (minIndex > pair.getIndex()) {
				minIndex = pair.getIndex();
			}
			if (maxIndex < pair.getIndex()) {
				maxIndex = pair.getIndex();
			}
			map.put(pair.getIndex(), pair.getNode());
			if (pair.getNode().left != null) {
				queue.add(new Pair(pair.getIndex() - 1, pair.getNode().left));
			}
			if (pair.getNode().right != null) {
				queue.add(new Pair(pair.getIndex() + 1, pair.getNode().right));
			}
		}
		//sorting in map
		for (int i = minIndex; i <= maxIndex; i++) {
			System.out.print(map.get(i).data + " ");
		}

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
		Node n12 = new Node(14);
		Node n13 = new Node(11);
		Node n14 = new Node(12);
		Node n15 = new Node(15);
		Node n16 = new Node(16);

		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n6.left = n9;
		n6.right = n10;
		n7.left = n11;
		n8.right = n12;
		n10.right = n13;
		n11.left = n14;
		n12.right = n15;
		n15.right = n16;

		bottomViewTraversal(root);
	}
}
