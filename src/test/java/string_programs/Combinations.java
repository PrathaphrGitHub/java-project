package string_programs;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j <s.length(); j++) {
				
				for (int k = i; k <=j; k++) {
					System.out.print(s.charAt(k));
				}	
				System.out.println();
			}
		}
	}
}
