package string_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

//o/p------> abd/&+13
public class SegregateString {

	@Test
	public void ascend() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----enter the word-----");
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
	}
	
	
	@Test
	public void descend() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----enter the word------");
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
	}
}
