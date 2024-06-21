package com.bro.code;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		
		/*
		 * Stack it is a LIFO data Structure Last-In-First-Out storing object into a
		 * sort of "vertical tower" push() to add to the top pop() to remove from the
		 * top
		 */

		Stack<String> stack = new Stack<>();
		stack.push("Aksh");
		stack.push("raj");
		stack.push("sham");
		stack.push("sunny");
		stack.push("john");

		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

//		stack.pop();
		System.out.println(stack.search("Aksh"));

		
		
//		String a=stack.pop();
//		stack.pop();
		System.out.println(stack);
//		System.out.println(a);
		
		
		
//		use of stack
//		1. undu/redu features in text editor
//		2. moving back/forword throwing browser history
//		3. backtracing algorithm (maze file directories)
//		4. calling function
		
		
	}
}
