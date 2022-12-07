package string_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PositionAndIndexOfAnyCharacter {

	@Test
	public void position1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);

		for (Character lv : set) {
			for (int i = 0; i < s.length(); i++) {
				if (lv == s.charAt(i)) {
					System.out.println(lv + " present in " + (i) + " index");
					System.out.println(lv + " present in " + (i + 1) + " position");
					System.out.println("---------");
					break;
				}
			}
		}
	}

	@Test
	public void position2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);

		for (Character lv : set) {
			for (int i = s.length() - 1; i >= 0; i--) {
				if (lv == s.charAt(i)) {
					System.out.println(lv + " present in " + (i) + " index");
					System.out.println(lv + " present in " + (i + 1) + " position");
					System.out.println("---------");
					break;
				}
			}
		}
	}
}
