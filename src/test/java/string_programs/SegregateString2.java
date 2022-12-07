package string_programs;

import java.util.Scanner;

public class SegregateString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----enter the word-----");
		String s = sc.next();
		
		String alpha="";
		String num="";
		String splchr="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha+=ch;
			} else if(ch>='0'&&ch<='9'){
				num+=ch;
			}
			else
			{
				splchr+=ch;
			}
		}
		
		System.out.println(alpha+splchr+num);
	}
}
