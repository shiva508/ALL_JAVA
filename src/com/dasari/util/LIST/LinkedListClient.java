package com.dasari.util.LIST;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClient {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		if (list.size()<20) {
			list.add(408);
			list.add(508);
			list.add(401);
		}
		System.out.println(list);
		list.addLast(608);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		System.out.println();
		System.out.println(list.peek());
		
	}
}
