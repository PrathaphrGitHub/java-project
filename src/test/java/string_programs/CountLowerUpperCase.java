package string_programs;

public class CountLowerUpperCase {

	public static void main(String[] args) {
		String s="KaNnADa";
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
