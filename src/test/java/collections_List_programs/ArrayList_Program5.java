package collections_List_programs;

import java.util.ArrayList;

public class ArrayList_Program5 {

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
		
		//get the size of the array list
		System.out.println("size="+list.size());
		
		//fetch the elements in the particular index
		System.out.println(list.get(2));
		
		//get the index of the elements
		System.out.println(list.indexOf('b'));
		
		//remove the elements in a particular index
		list.remove(2);
		//remove the elements from array list
		list.remove(15.5);
		System.out.println(list);
		
		//insert the new element to array list
		list.set(3, "shivamma");
		System.out.println(list);
	}
}
