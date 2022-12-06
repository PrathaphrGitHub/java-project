package arrays_programs;

import org.testng.annotations.Test;

public class First3MaxNumSumAndProduct {

	@Test
	public void sum1(String[] args) {
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
		int sum = fMax + sMax + tMax;
		System.out.println("Sum = " + sum);

		int pro = fMax * sMax * tMax;
		System.out.println("Product = " + pro);
	}
	
	@Test
	public void sum2(String[] args) {
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
		
		int pro = 1;
		for (int i = 0; i < 3; i++) {
			pro *= a[i];
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += a[i];
		}
		
		System.out.println("Sum =  " + sum);
		System.out.println("Product =  " + pro);
	}
}
