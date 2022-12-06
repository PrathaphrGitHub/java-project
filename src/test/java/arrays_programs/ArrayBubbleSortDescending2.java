package arrays_programs;

import java.util.Arrays;
//program for descending using bubble sorting
public class ArrayBubbleSortDescending2 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 1, 2, 6, 8, 9, 7 };
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("--------------");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
	}
}
