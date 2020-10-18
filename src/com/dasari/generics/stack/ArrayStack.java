package com.dasari.generics.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {

	public List<E> list;
	
	
	
	public ArrayStack() {
		list=new ArrayList<>();
	}

	@Override
	public boolean empty() {
		return list.size()==0;
	}

	@Override
	public void push(E input) {
		list.add(input);
	}

	@Override
	public E pop() {
		return list.remove(list.size()-1);
	}

}
