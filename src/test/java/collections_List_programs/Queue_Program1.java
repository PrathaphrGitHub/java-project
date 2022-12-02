package collections_List_programs;

import java.util.PriorityQueue;

public class Queue_Program1 {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue<>();
		q.add('A');
		q.add('C');
		q.add('E');
		q.add('D');
		q.add('Z');
		q.add('P');
		
		System.out.println(q);
		
		//used to fetch top most element peek()
		//q.peek();
		System.out.println(q.peek());
		
		//used to remove the top most element and insertion order is not maintained after poll()
		q.poll();
		System.out.println(q);
		
	}
}
