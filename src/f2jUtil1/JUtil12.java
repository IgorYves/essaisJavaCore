package f2jUtil1;

import java.util.Stack;

class JUtil12 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println(st);
		System.out.println("--------------");
		
		st.push(1);
		st.push(5);
		st.push(101);
		st.push(20);
		st.push(25);
		st.push(220);
		st.push(333);
		System.out.println(st);
		
		System.out.println("--------------");
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println("--------------");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.search(5));
		
		
	}
}
