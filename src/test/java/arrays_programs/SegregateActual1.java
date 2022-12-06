package arrays_programs;

import java.util.Arrays;

public class SegregateActual1 {

	public static void main(String[] args) {
		int[] a = { 1, 0, 1, 0, 0, 0, 0, 1, 1, 1 };

		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				c++;
			} 
		}
		
		for (int i = 0; i < c; i++) {
			a[i]=0;
		}

		for (int i = c; i < a.length; i++) {
			a[i]=1;
		}
		System.out.println(Arrays.toString(a));
	}
}
