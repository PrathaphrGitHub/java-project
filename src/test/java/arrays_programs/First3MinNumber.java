package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class First3MinNumber {

	@Test
	public  void min1() {
		int[] a = { 6, 9, 3, 8, 3, 2, 4, 11, 1, 10, 2 };
		int fMin = a[0];
		int sMin = a[1];
		int tMin = a[2];

		for (int i = 1; i < a.length; i++) {

			if (a[i] < fMin) {
				tMin = sMin;
				sMin = fMin;
				fMin = a[i];
			} else if (a[i] < sMin && a[i] > fMin) {
				tMin = sMin;
				sMin = a[i];
			} else if (a[i] < tMin && a[i] > sMin && a[i]>fMin) {
				tMin = a[i];
			}
		}

		System.out.println("first minimum number is = " + fMin);
		System.out.println("second minimum number is = " + sMin);
		System.out.println("second minimum number is = " + tMin);
	}
	

	@Test
	public void min2() {
		int[] a = { 5, 6, 0, 3, 2, 17, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("first minimum number is = " + a[0]);
		System.out.println("second minimum number is = " + a[1]);
		System.out.println("second minimum number is = " + a[2]);
	}
}
