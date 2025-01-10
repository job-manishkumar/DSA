package training.practice.geeksforgeeks.arrays.basic;

/*You are given an integer n. You need to convert all zeroes of n to 5.*/
public class ReplaceAll0With5 {

	//approach 1
	//tc ->O(n) and sc ->O(1)
	public static int replace(int number) {
		int n = 0;
		if(number ==0){
			return 5;
		}
		while (number > 0) {
			int reminder = number % 10;
			if (reminder == 0) {
				reminder = 5;
			}
			n = n * 10 + reminder;
			number = number / 10;
		}

		while (n > 0) {
			number = number * 10 + n % 10;
			n = n / 10;
		}
		return number;
	}

	//approach 2
	public static int replace_2(int number) {
		String str = String.valueOf(number);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '0') {
				ch = '5';
			}
			sb.append(ch);
		}
		return Integer.parseInt(sb.toString());
	}
	// approach 3 -- using in-build function of string
	public static int replace_3(int number) {
		return Integer.parseInt(String.valueOf(number).replace('0','5'));
	}


	public static void main(String[] args) {
		int number = 0;
		System.out.println(replace(number));
		System.out.println("=======");
		System.out.println(replace_2(number));
		System.out.println("=======");
		System.out.println(replace_3(number));
	}
}
