package collections_List_programs;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayList_Program8 {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add('a');
		v.add('b');
		v.add("prathap");
		v.add("virat");
		v.add("anushka");
		v.add("vamika");
		v.add(1);
		v.add(2);
		v.add(null);
		v.add('a');
		v.add(true);
		v.add(false);
		v.add(15.5);
		v.add(null);
		v.add('b');
		v.add(30.258);
		v.add(true);
		v.add(false);
		v.add("prathap");
		
		
		ArrayList list = new ArrayList<>(v);
		System.out.println(list);
		//iterating the arraylist
		ListIterator<Object> ltr = list.listIterator();
		while (ltr.hasNext()) {
			Object data = ltr.next();
			System.out.println(data);
		}
	}
}
