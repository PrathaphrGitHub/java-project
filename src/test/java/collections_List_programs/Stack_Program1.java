package collections_List_programs;

import java.util.Stack;

public class Stack_Program1 {

	public static void main(String[] args) {
		Stack st = new  Stack<Object>();
		st.push(10);
		st.push(30);
		st.push("prathap");
		st.push('a');
		
		//to fetch the top most element in stack
		System.out.println(st.peek());
		
		//remove the top most element
		st.pop();
		System.out.println(st);		
	}
}
