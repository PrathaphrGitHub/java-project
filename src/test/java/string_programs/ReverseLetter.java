package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseLetter {

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
		System.out.println(rev);
	}

	// using length() method
	@Test
	public void reverse2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

	// using length variable
	@Test
	public void reverse3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
	}

	// using count
	@Test
	public void reverse4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.next();
		String s = st.toLowerCase();
		char[] ch = s.toCharArray();
		int count = 0;

		for (char lv : ch) {
			count++;
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
	}

	// using stringBuilder and string buffer
	@Test
	public void reverse5() {
		StringBuffer sb = new StringBuffer("prathap");
		sb.reverse();
		System.out.println(sb);
	}
}
