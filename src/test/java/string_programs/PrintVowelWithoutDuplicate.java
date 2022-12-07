package string_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintVowelWithoutDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String st = sc.next();
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				set.add(ch);
			} 
		}
		System.out.println(set);
	}
}
