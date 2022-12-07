package string_programs;

public class ReverseAlphabate {

	public static void main(String[] args) {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for (char ch = 'z'; ch >= 'a'; ch--) {

			System.out.print(ch + " ");
		}

		System.out.println();
		char ch = 'z';
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(ch-- + " ");
		}

	}
}
