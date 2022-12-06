package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Segregating1 {

	// one way
	@Test
	public void segregate1() {
		int[] a = { 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1 };

		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				c++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (i < c) {
				a[i] = 0;
			} else {
				a[i] = 1;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	// another way
	@Test
	public void segregate2() {
		int[] a = { 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1 };
		int b[] = new int[a.length];

		int m = 0;
		int n = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[m] = a[i];
				m++;
			} else {
				b[n] = a[i];
				n--;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
