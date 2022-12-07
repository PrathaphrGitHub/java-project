package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseArray {

	@Test
	public void reverse() {
		int[] a = { 9, 8, 7, 8, 1, 1, 2 };

		int[] rev = new int[a.length];

		for (int i = 0, j = a.length - 1; i < rev.length; i++, j--) {
			rev[i] = a[j];
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(rev));
	}
}
