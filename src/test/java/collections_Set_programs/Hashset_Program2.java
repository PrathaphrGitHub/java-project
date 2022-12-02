package collections_Set_programs;

import java.util.HashSet;

public class Hashset_Program2 {

	public static void main(String[] args) {

		HashSet set = new HashSet<>();
		set.add('a');
		set.add('b');
		set.add("prathap");
		set.add("virat");
		set.add("anushka");
		set.add("vamika");
		set.add(1);
		set.add(2);
		set.add(null);
		set.add('a');
		set.add(true);
		set.add(false);
		set.add(15.5);
		set.add(null);
		set.add('b');
		set.add(30.258);
		set.add(true);
		set.add(false);
		set.add("prathap");

		System.out.println(set);

		System.out.println(set.size());
		System.out.println(set.contains('a'));
		System.out.println(set.isEmpty());
		System.out.println(set.remove('b'));
	}
}
