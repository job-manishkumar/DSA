package training.practice.geeksforgeeks.arrays.basic;

public class FindTheFine {

	//td -> O(n) and sc -> O(1)
	public static long calculatedTotalFine(int[] cars, int[] fines, int date) {

		long totalFine = 0;
		if (date % 2 == 0) {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] % 2 != 0) {
					totalFine += fines[i];
				}
			}
		} else {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] % 2 == 0) {
					totalFine += fines[i];
				}
			}
		}
		return totalFine;
	}

	public static void main(String[] args) {
		int[] cars = {2375, 7682, 2325, 2352};
		int[] fines = {250, 500, 350, 200};
		int date = 12;

		System.out.println(calculatedTotalFine(cars, fines, date));

	}
}
