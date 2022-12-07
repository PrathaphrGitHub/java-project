package string_programs;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String st = sc.next();
		String s = st.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		String vowel = "";
		String consonant = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel += ch + " ";
				vowelCount++;
			} else {
				consonant += ch + " ";
				consonantCount++;
			}

		}
		System.out.println("Vowels = " + vowel);
		System.out.println("vowel count = " + vowelCount);
		System.out.println("---------------");
		System.out.println("Consonants = " + consonant);
		System.out.println("consonant count = " + consonantCount);
	}
}
