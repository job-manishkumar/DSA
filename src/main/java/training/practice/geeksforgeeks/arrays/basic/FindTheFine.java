package training.practice.geeksforgeeks.arrays.basic;

/*Given an array of car numbers car[], an array of penalties fine[], and an integer value date. The task is to find
the total fine which will be collected on the given date. The fine is collected from odd-numbered cars on even dates
and vice versa.*/
public class FindTheFine {

	//tc -> O(n) and sc ->O(1)
	public static long collectionTotalFine(int data, int[] cars, int[] fines) {
		long totalFine = 0;
		if (data % 2 == 0) {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] % 2 != 0) {
					totalFine += fines[i];
				}
			}
			return totalFine;
		}
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] % 2 == 0) {
				totalFine += fines[i];
			}
		}
		return totalFine;
	}

	public static void main(String[] args) {
		int date = 12;
		int[] cars = {2375, 7682, 2325, 2352};
		int[] fines = {250, 500, 350, 200};
		System.out.println(collectionTotalFine(date,cars,fines));
	}
}
