package collections_List_programs;

import java.util.Stack;

public class Stack_Program2 {

	public static void main(String[] args) {
		Stack st = new  Stack();
		st.push(10);
		st.push(30);
		st.push("prathap");
		st.push('a');
		System.out.println(st);
		
		//pop() is used to remove the top most
		st.pop();
		System.out.println(st);
		
		//peek() is used get the top most value
		System.out.println(st.peek());
		
		//to get the size of the stack
		System.out.println(st.size());
	}
}
