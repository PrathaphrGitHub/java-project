package string_programs;

import java.util.Scanner;

public class PrintVowelWithoutDuplicate2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String st = sc.next();
		String s = st.toLowerCase();
		String op="";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
				if (count > 1) {
					ch[j] = ' ';
					count = 0;
				}

			}
			if (ch[i] != ' ') {
				op+=ch[i];
			}
		}
		char[] vow = op.toCharArray();
		String v="";
		for (int i = 0; i < vow.length; i++) {
			char chr=vow[i];
			if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'
				||chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
				v+=chr;
			} 
		}
		System.out.println(v);
	}
}
