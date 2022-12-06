package number_system_programs;

import java.util.Scanner;

public class SwapWithThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for a");
		int a = sc.nextInt();

		System.out.println("enter the value for b");
		int b = sc.nextInt();

		int temp = a;

		a = b;
		b = temp;
		
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
}
