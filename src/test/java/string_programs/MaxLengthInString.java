package string_programs;

public class MaxLengthInString {

	public static void main(String[] args) {
		String[] s = { "12", "1234", "12345", "5678" };
		int biggest = s[0].length();

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > biggest) {
				biggest = s[i].length();
			}
		}

		System.out.println("Maximum length = "+biggest);
		for (int i = 0; i < s.length; i++) {
			if (biggest == s[i].length()) {
				System.out.println(s[i]);
			}
		}

	}
}
