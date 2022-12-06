package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

//program for find 1st maximum number
public class FirstMaxNum {

	// without bubble sorting
	@Test
	public void max1() {
		int[] a = { 5, 2, 3, 6, 9, 8, 4, 1, 10};
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("maximum number is = " + max);
	}

	// with bubble sorting
	@Test
	public void max2() {
		int[] a = { 5, 2, 3, 6, 9, 8, 4, 1, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("first minimum number is = " + a[0]);
	}
}
