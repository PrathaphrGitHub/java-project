package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

//program for  of  1st 2 minimum number in an array
public class First2MaxNum {

	//without bubble sorting
	@Test
	public void max1() {
		System.out.println("without bubble sorting");
		int[] a = { -5, 1, 2, 3, 6, 9, 11, 8, 4, 11, 10, -1 };
		int fMax = a[0];
		int sMax = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > fMax) {
				sMax = fMax;
				fMax = a[i];
			} else if (a[i] > sMax && a[i] < fMax) {
				sMax = a[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println("first maximum number is = " + fMax);
		System.out.println("second maximum number is = " + sMax);
	}

	//bubble sorting
	@Test
	public void max2() {
		System.out.println("with bubble sorting");
		int[] a = { -5, 1, 2, 3, 6, 9, 8, 4, 11, 10, -1 };

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
		System.out.println("first maximum number is = " + a[0]);
		System.out.println("second maximum number is = " + a[1]);
	}
}
