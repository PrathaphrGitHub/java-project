package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SwapFirstAndLastWord {

	@Test
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = "i am from bangalore";// sc.nextLine();
		String[] input = s.split(" ");
		
		String temp = input[0];
		input[0] = input[input.length - 1];
		input[input.length - 1] = temp;
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
	
	}
}
