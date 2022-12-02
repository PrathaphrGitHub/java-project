package collections_List_programs;

import java.util.ArrayList;
//program for adding objects to array list and retrieve objects one by one
public class ArrayList_Program1 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add('a');
		list.add('b');
		list.add("prathap");
		list.add("virat");
		list.add("anushka");
		list.add("vamika");
		list.add(1);
		list.add(2);
		list.add(null);
		list.add('a');
		list.add(true);
		list.add(false);
		list.add(15.5);
		list.add(null);
		list.add('b');
		list.add(30.258);
		list.add(true);
		list.add(false);
		list.add("prathap");
		
		System.out.println(list);
		
		System.out.println("-------------");
		for (Object lv : list) {
			System.out.println(lv);
		}
	}
}
