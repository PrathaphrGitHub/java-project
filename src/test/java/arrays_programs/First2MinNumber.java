package arrays_programs;

import org.testng.annotations.Test;

//program for 1st 2 minimum number in an array without sorting
public class First2MinNumber {

	@Test
	public void min1() {
		int[] a = { 5, 5, 1, 0, 4, 0 };
		int fMin = a[0];
		int sMin = a[1];

		for (int i = 1; i < a.length; i++) {

			if (a[i] < fMin) {
				sMin = fMin;
				fMin = a[i];
			} else if (a[i] < sMin && a[i] > fMin) {
				sMin = a[i];
			}
		}

		System.out.println("first minimum number is = " + fMin);
		System.out.println("second minimum number is = " + sMin);
	}

	@Test
	public void min2() {
		int[] a = { 5, 6, 0, 3, 2, 17,9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
//			System.out.println(Arrays.toString(a));
		System.out.println("first minimum number is = " + a[0]);
		System.out.println("second minimum number is = " + a[1]);
	}
}
