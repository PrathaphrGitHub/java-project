package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPalindrome {

	// using third variable
	@Test
	public void reverse1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (rev.equalsIgnoreCase(s)) {
			System.out.println(st + "  is palindrome");
		} else {
			System.out.println(st + "  is not  palindrome");
		}
	}
}
