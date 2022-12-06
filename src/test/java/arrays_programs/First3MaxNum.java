package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class First3MaxNum {

	//without bubble sorting
	@Test
	public void max1() {
		int[] a = { 6, 9, 3, 8, 3, 2, 4, 11, 1, 10, 2 };
		int fMax = a[0];
		int sMax = a[1];
		int tMax = a[2];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > fMax) {
				tMax = sMax;
				sMax = fMax;
				fMax = a[i];
			} else if (a[i] > sMax && a[i] < fMax) {
				tMax = sMax;
				sMax = a[i];
			} else if (a[i] > tMax && a[i] < sMax && a[i] < fMax) {
				tMax = a[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println("first maximum number is = " + fMax);
		System.out.println("second maximum number is = " + sMax);
		System.out.println("second maximum number is = " + tMax);
	}
	
	//with bubble sorting
	@Test
	public void max2() {
		int[] a = { 5, 2, 3, 6, 9, 8, 4, 1, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("first maximum number is = " + a[0]);
		System.out.println("second maximum number is = " + a[1]);
		System.out.println("third maximum number is = " + a[2]);
	}
}
