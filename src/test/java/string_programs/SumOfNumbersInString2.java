package string_programs;

public class SumOfNumbersInString2 {

	public static void main(String[] args) {
		String s = "a1c2d4";
		String t = "";
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			t="";
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				t=t+s.charAt(i);
				sum=sum+Integer.parseInt(t);
			}
			
		}
		System.out.println(sum);
	}
}
