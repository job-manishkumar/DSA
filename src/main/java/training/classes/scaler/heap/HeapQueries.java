package training.classes.scaler.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


/*You have an empty min heap. You are given an array A consisting of N queries. Let P denote A[i][0] and Q denote A[i][1]. There are two types of queries:

P = 1, Q = -1 : Pop the minimum element from the heap.
P = 2, 1 <= Q <= 109 : Insert Q into the heap.

Return an integer array containing the answer for all the extract min operation. If the size of heap is 0, then extract min should return -1.*/
public class HeapQueries {

	public static List<Integer> getHeapQueries(int[][] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int p = arr[i][0];
			int q = arr[i][1];
			if (p == 1) {
				if (!pq.isEmpty()) {
					list.add(pq.remove());
				} else {
					list.add(-1);
				}
			} else if (p == 2) {
				pq.add(q);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		//int[][] arr = {{1, -1}, {2, 2}, {2, 1}, {1, -1}};
		int[][] arr = {{2, 5}, {2, 3}, {2, 1}, {1, -1}, {1, -1}};
		System.out.println(getHeapQueries(arr));
	}
}
