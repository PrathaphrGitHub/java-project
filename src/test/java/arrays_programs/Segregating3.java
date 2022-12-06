package arrays_programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Segregating3 {

	@Test
	public void segregate1() {
		int[] a = { 4, 0, 2, 0 ,1,5,6,6};

		// count the number of zeros
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				c++;
			}
		}
		
		int j=a.length-1;
		for (int i = a.length-1; i >=0; i--) {
			if (a[i]!=0) {
				a[j]=a[i];
				j--;
			}
		}
		
		for (int i = 0; i < c; i++) {
			a[i]=0;
		}

		System.out.println(Arrays.toString(a));
	}
	
	// another way
//		@Test
//		public void segregate2() {
//			
//			int[] a = { 4, 0, 2, 0 ,1,5};
//			int b[] = new int[a.length];
//
//			int m = 0;
//			int n = a.length - 1;
//
//			for (int i = 0; i < a.length; i++) {
//				
//				if (a[i] == 0) {
//					b[m] = a[i];
//					m++;
//				} else {
//					b[n] = a[i];
//					n--;
//				}
//			}
//			System.out.println(Arrays.toString(b));
//		}

}
