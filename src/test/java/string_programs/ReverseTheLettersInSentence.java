package string_programs;

public class ReverseTheLettersInSentence {

	public static void main(String[] args) {
		String s = "i am prathap";
		System.out.println(s);

		// p ah tarpmai
		String[] str = s.split(" ");
		int[] size = new int[str.length];

		for (int i = 0; i < size.length; i++) {
			size[i] = str[i].length();
		}
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (!(s.charAt(i) == ' ')) {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s2);
		//pahtarpmai
		String s3 = "";
		int k=0;
		for (int i = 0; i < size.length; i++) {
			int n=size[i];
			while (n>0) {
				s3=s3+s2.charAt(k++);
				n--;
			}
			s3=s3+" ";
		}

		System.out.println(s3);
	}
}
