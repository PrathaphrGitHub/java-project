package string_programs;

public class MinLengthInString {

	public static void main(String[] args) {
		String[] s = { "ab", "abcd", "abcde", "ij" };
		int smallest = s[0].length();

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < smallest) {
				smallest = s[i].length();
			}
		}

		System.out.println("Minimum Length = "+smallest);
		for (int i = 0; i < s.length; i++) {
			if (smallest == s[i].length()) {
				System.out.println(s[i]);
			}
		}

	}
}
