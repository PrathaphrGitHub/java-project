package collections_Set_programs;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset_Program1 {

	public static void main(String[] args) {
		SortedSet set = new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(10);
		set.add(3);
		set.add(5);
		System.out.println(set);
	}
}
