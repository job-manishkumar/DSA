package training.practice.scaler.introtoproblemsolving;

/*Given a number A. Return 1 if A is prime and return 0 if not.*/
public class CheckPrimeNumber {

	//approach 1
	//tc -> O(n) and sc -> O(n)
	public static int checkPrime(int number) {
		int countFactor = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				countFactor++;
			}
		}
		if (countFactor == 2) {
			return 1;
		}
		return 0;
	}

	//approach 2
	public static int checkPrime_2(int number) {
		int countFactor = 0;
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				if (i == number / i) {
					countFactor++;
				} else {
					countFactor += 2;
				}
			}
		}
		if (countFactor == 2) {
			return 1;
		}
		return 0;
	}

	//approach 3
	public static int checkPrime_3(int number) {
		if (number < 2) {
			return 0;
		}
		if (number == 2 || number == 3) {
			return 1;
		}
		if (number % 2 == 0 || number % 3 == 0) {
			return 0;
		}
		for (int i = 5; i * i <= number; i += 7) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int number = 31;
		System.out.println(checkPrime(number));
		System.out.println("=========");
		System.out.println(checkPrime_2(number));
		System.out.println("=========");
		System.out.println(checkPrime_3(number));
	}
}
