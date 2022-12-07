package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class RevreseLettersInWord {

	@Test
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		String[] input = s.split(" ");
		String rev = "";
		for (String lv : input) {
			for (int i = lv.length()-1; i >= 0; i--) {
				rev+=lv.charAt(i);
			}
			rev+=" ";
		
		}

		System.out.println(rev);
	}
}
