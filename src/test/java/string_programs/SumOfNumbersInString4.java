package string_programs;

//best logic
public class SumOfNumbersInString4 {

	public static void main(String[] args) {
		String s = "a11bb21e3215";
		int tsum=0;
		int sum=0;

		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			
			if (ch>='0'&&ch<='9') {
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		
		System.out.println("sum = "+sum);
	}
}
