package string_without_collection;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "kannada";
		String s1 = "";
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
				s1 += ch[i];
			}
		}
		System.out.println(s1);
	}
}
