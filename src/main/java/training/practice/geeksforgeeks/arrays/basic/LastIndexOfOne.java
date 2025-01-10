package training.practice.geeksforgeeks.arrays.basic;

/*Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.

Note: If '1' is not present, return "-1"*/
public class LastIndexOfOne {

	//tc -> O(n) and sc ->O(1)
	public static int getLastOne(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '1') {
				return i;
			}
		}
		return -1;
	}

	// using in-build function
	public static int getLastOne_2(String str) {

		return str.lastIndexOf('1');
	}

	public static void main(String[] args) {
		String s = "00001";
		System.out.println(getLastOne(s));
		System.out.println("==========");
		System.out.println(getLastOne_2(s));
	}
}
