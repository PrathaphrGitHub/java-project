package arrays_programs;

import java.util.Arrays;
//program for ascending using bubble sorting
public class ArrayBubbleSortAscending2 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 1, 2, 6 };

		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("--------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
	}
}
