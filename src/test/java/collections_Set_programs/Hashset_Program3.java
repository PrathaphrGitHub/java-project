package collections_Set_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Program3 {

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
		
		ArrayList list = new ArrayList<>(set);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
