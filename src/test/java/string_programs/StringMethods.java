package string_programs;

public class StringMethods {

	public static void main(String[] args) {
		
		//count number of characters in the string
		String s1="bangalore";
		System.out.println("length = "+s1.length());
		
		
		//convert string to character array
		String s2="mysore";
		char[] ch = s2.toCharArray();
		System.out.println("length = "+ch.length);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
