package com.dasari.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedlistSimulator {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("shiva");
		list.add(230);
		list.add(null);
		System.out.println(list);
		list.set(0,"Dead");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("He is hated by everyone!");
		System.out.println(list);
	}
}
