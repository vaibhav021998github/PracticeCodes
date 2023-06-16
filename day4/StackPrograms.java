package com.test.day4;

import java.util.Stack;

public class StackPrograms {

	public static void main(String[] args) {
		// Stack Programs...
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(52);
		stack.push(41);
		stack.push(11);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println("This element is removed in stack = "+stack.pop());
		System.out.println(stack);

	}

}
