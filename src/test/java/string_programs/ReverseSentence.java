package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseSentence {

	@Test
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		String[] input = s.split(" ");
		String rev = "";
		for (int i = input.length - 1; i >= 0; i--) {
			rev += input[i] + " ";
		}

		System.out.println(rev);
	}
}
