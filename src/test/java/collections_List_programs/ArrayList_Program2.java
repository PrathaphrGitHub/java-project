package collections_List_programs;

import java.util.ArrayList;
import java.util.Collections;

//program for adding objects to array list and sort elements in orders
public class ArrayList_Program2 {

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(2);
		
		//sort element in ascending order
		Collections.sort(list);
		System.out.println(list);
	}
}
