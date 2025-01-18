package training.practice.geeksforgeeks.arrays.basic;

/*For a given string s comprising only lowercase English alphabets, eliminate the vowels from the string that occur
between two consonants(sandwiched between two immediately adjacent consonants). Return the new string.*/
public class SandwichedVowels {

	//approach1
	public static String removeSandwichVowels(String s) {
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toLowerCase().toCharArray();
		sb.append(ch[0]);
		for (int i = 1; i < ch.length - 1; i++) {
			if (!isVowel(ch[i])) {
				sb.append(ch[i]);
			} else if (isVowel(ch[i - 1]) || isVowel(ch[i + 1])) {
				sb.append(ch[i]);
			}
		}
		sb.append(ch[ch.length - 1]);
		return new String(sb);
	}

	public static boolean isVowel(char c) {
		return "aeiou".indexOf(c) >= 0;
	}

	public static void main(String[] args) {
		String s = "hqyisjastsjxpuoscndtxvifoamcxabtbqnwfkxmbtrrqfb";
		System.out.println(removeSandwichVowels(s));
	}
}
