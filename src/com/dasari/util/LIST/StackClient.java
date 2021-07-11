package com.dasari.util.LIST;

import java.util.Stack;

public class StackClient {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(504);
		stack.push(508);
		stack.push(507);
		stack.push(503);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search(508));
	}
}
