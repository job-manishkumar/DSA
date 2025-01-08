package training.practice.scaler.introtoproblemsolving;

/*Given an integer A, you need to find the count of it’s factors. Factors of a number is the number is the number which divides it perfectly leaving no remainder.*/
public class CountFactor {

	//approach 1
	//tc-> O(n) and sc -> O(1)
	public static int countFactors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}

	//approach 2
	// tc -> O(logn) and sc ->O(n)
	public static int countFactors_2(int number) {
		int count = 0;
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				if (i == number / i) {
					count++;
				} else {
					count += 2;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 24;//1,2,3,4,6,8,12,24
		System.out.println(countFactors(number));
		System.out.println("==============");
		System.out.println(countFactors_2(number));
	}
}
