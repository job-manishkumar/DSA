package training.classes.scaler.linkedlistproblems;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		//list.removeData(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		//check value is present or not
		System.out.println(list.contains(30));
		System.out.println(list.contains(50));
		//add in index
		list.add(60, 10);

		list.add(50, 3);
		System.out.println(list);

		//getKth Index value
		System.out.println(list.getKthIndexValue(4));
		//get size of list
		System.out.println(list.size());

		//delete list 10 data
		list.removeData(10);
		//delete form last
		list.removeData(60);
		list.removeData(50);
		System.out.println(list);
		System.out.println(list.size());


	}
}
