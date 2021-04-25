package com.dasari.util.Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		processStackPush(stack);
		System.out.println("SIZE:" + stack.size());
		processStackPeek(stack);
		processStackSearch(stack,4);
		processStackPop(stack);
		processStackEmpty(stack);
		

	}

	private static void processStackEmpty(Stack<Integer> stack) {
		System.out.println("EMPTY");
		stack.empty();
		System.out.println("Size:"+stack.size());
		
	}

	private static void processStackSearch(Stack<Integer> stack, int i) {
		System.out.println("SEARCH:");
		Integer val=stack.search(i);
		System.out.println(val);
		
	}

	private static void processStackPeek(Stack<Integer> stack) {
		System.out.println("PEEK:");
		Integer val = stack.peek();
		System.out.println(val);

	}

	private static void processStackPop(Stack<Integer> stack) {
		System.out.println("Pop:");
		for (int i = 0; i < 5; i++) {
			Integer val = stack.pop();
			System.out.println(val);
		}

	}

	private static void processStackPush(Stack<Integer> stack) {
		System.out.println("Push:");
		for (int i = 0; i < 5; i++) {
			stack.add(i);
		}
	}

}
