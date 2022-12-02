package collections_Set_programs;

import java.util.TreeSet;

public class Treeset_Program1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		set.add(100);
		set.add(50);
		set.add(22);
		set.add(110);
		set.add(300);
		set.add(5);
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(100);
		set.add(30);
		set.add(60);
		set.add(35);
		set.add(3);
		set.add(5);
		set.add(20);
		set.add(1);
		set.add(15);
		set.add(45);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		//it will automatically sort the elements in ascending order by default
		System.out.println(set);
		
		//it is used to  sort the elements in descending order
		System.out.println(set.descendingSet());
		
		if (set.contains(2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		//fetch first element
		System.out.println(set.first());
		
		//it will fetch last element
		System.out.println(set.last());
		
		//fetch first element
		System.out.println(set.pollFirst());
		
		//it will fetch last element
		System.out.println(set.pollLast());
	
		
		//it will fetch all the element less than the mentioned value
		System.out.println(set.headSet(50));
		
		//it will fetch all the element including mentioned value
		System.out.println(set.headSet(52, true));
		
		//it will fetch all the element less than the mentioned value
		System.out.println(set.headSet(50, false));
		
		//it will fetch all the element greater than or equal to  mentioned value
		System.out.println(set.tailSet(50));
		
		//it will fetch all the element greater than to  mentioned value
		System.out.println(set.tailSet(50,false));
		
	}
}
