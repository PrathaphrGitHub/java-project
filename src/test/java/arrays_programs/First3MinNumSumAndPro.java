package arrays_programs;

import org.testng.annotations.Test;

//program for sum of  1st 3 minimum number in an array without sorting
public class First3MinNumSumAndPro {

	@Test
	public void min1() {
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
			} else if (a[i] < tMin && a[i] > sMin && a[i] > fMin) {
				tMin = a[i];
			}
		}

		System.out.println("--------");
		int sum = fMin + sMin + tMin;
		int pro = fMin * sMin * tMin;

		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
		System.out.println("-----------");
	}
	
	@Test
	public void min2() {
		int[] a = { 5, 6,3, 2, 17, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
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
