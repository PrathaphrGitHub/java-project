package collections_List_programs;

import java.util.ArrayList;

//program for adding all the objects to another array list 
public class ArrayList_Program3 {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add('a');
		list1.add('b');
		list1.add("prathap");
		list1.add("virat");
		list1.add("anushka");
		list1.add("vamika");
		list1.add(1);
		list1.add(2);
		list1.add(null);
		list1.add('a');
		list1.add(true);
		list1.add(false);
		list1.add(15.5);
		list1.add(null);
		list1.add('b');
		list1.add(30.258);
		list1.add(true);
		list1.add(false);
		list1.add("prathap");
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		
		//adding all the objects to another array list
		list2.addAll(list1);
		System.out.println(list2);
		
		System.out.println("--------");
		
		//used to fetch objects one by one using for loop
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
	}
}
