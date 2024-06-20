package collectionEx;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		System.out.println("My stack:");
		Stack<Integer> s = new Stack<>();
		System.out.println("Is empty or not:" + s.isEmpty());
		s.push(10);// add element in stack
		s.push(12);
		s.push(14);
		s.push(39);
		System.out.println("My elements:" + s);
		s.pop();
		s.push(50);
		System.out.println("After Pop my elements:" + s);
		System.out.println("Top of the elment:" + s.peek());// top of element
		System.out.println(s.isEmpty());
	}

}
