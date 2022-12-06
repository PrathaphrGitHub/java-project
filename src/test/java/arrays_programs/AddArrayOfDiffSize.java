package arrays_programs;

import org.testng.annotations.Test;

public class AddArrayOfDiffSize {
	

	@Test
	public void add1() {
		int[] a= {5,3,4};
		int[] b= {2,1,3,4};
		
		int length=a.length;
		if (b.length>a.length) {
			length=b.length;
		}
		
		for (int i = 0; i < length; i++) {
			try {
				System.out.print(a[i]+b[i]+",");
			} catch (Exception e) {
				if (a.length>b.length) {
					System.out.print(a[i]+",");
				}
				else {
					System.out.print(b[i]+",");
				}
				
			   }
			}
		System.out.println();
		System.out.println("--------");
	}
	
	@Test
	public void add2() {
		int[] a = { 5, 3, 4 };
		int[] b = { 2, 1, 3, 4 };

		int[] c = a;
		int[] d = b;

		if (a.length > b.length) {
			c = b;
			d = a;
		}

		for (int i = 0; i < d.length; i++) {
			if (i < c.length) {
				d[i] = c[i] + d[i];
			}

			System.out.println(d[i] + " ");
		}
	}
}
