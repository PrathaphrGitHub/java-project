package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

//program for find 1st minimum number in an array without sorting
public class FirstMinNumber {

	@Test
	public void min1() {
		int[] a = { 5, 2, 3, 6, 9, 8, 4, 1, 10 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("minimum number is = " + min);
	}
	
	@Test
	public void min2() {
		int[] a = { 5, 2, 3, 6, 9, 8, 4, 1, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {
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
