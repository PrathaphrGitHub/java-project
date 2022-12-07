package string_programs;

import java.util.Scanner;

public class CountLowerUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s = sc.next();
		int uc=0;
		int lc=0;
		for (int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch>='a'&& ch<='z') {
				lc++;
			} else if(ch>='A'&&ch<='Z') {
				uc++;
			}
		}
		System.out.println("Lower case count = "+lc);
		System.out.println("upper case count = "+uc);
	}
}
