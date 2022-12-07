package string_programs;

public class SumOfNumbersInString3 {

	public static void main(String[] args) {
		String s1 = "a11b21e321";
		char[] ch = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (!(ch[i] >= '0' && ch[i] <= '9')) {
				ch[i] = ' ';
			}
		}
		
		System.out.println(ch);
		// convert character to string array
		String s2 = new String(ch);
		System.out.println(s2);
		
		// to remove spaces in 1st and last position
		String s3 = s2.trim();
		System.out.println(s3);
		// spit the string
		String[] ch2 = s3.split(" ");
		int sum = 0;
		for (int i = 0; i < ch2.length; i++) {
			sum = sum + Integer.parseInt(ch2[i]);
		}
		
		System.out.println("sum = "+sum);
	}
}
