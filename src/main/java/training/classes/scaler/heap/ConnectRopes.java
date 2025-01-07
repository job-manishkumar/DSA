package training.classes.scaler.heap;

import java.util.PriorityQueue;

/*You are given an array A of integers that represent the lengths of ropes.
You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
Find and return the minimum cost to connect these ropes into one rope.*/
public class ConnectRopes {

	public static int getMinimumCost(int[] arr) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		int total_cost = 0;
		for (int i : arr) {
			p.add(i);
		}
		while (p.size() > 1) {
			int firstRope = p.remove();
			int secondRope = p.remove();
			int sum = firstRope + secondRope;
			p.add(sum);
			total_cost += sum;
		}
		return total_cost;
	}

	public static void main(String[] args) {
		int[] arr = {5, 17, 100, 11};
		System.out.println(getMinimumCost(arr));
	}


}
