package training.practice.scaler.introtoproblemsolving;

/*you will be given an integer n. You need to return the count of prime numbers less than or equal to n.*/
public class CountPrimeNumber {

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 7) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimeNumber(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 30;
		System.out.println(countPrimeNumber(number));
	}
}
