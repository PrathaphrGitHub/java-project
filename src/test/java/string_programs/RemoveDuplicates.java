package string_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class RemoveDuplicates {

	// with collection
	@Test
	public void remove1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		LinkedHashSet set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
