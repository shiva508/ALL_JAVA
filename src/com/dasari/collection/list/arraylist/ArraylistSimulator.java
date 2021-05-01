package com.dasari.collection.list.arraylist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ArraylistSimulator {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		basicOperation(list);
		synchronizedArrayList();
		list.forEach(data->System.out.println(data));
	}

	private static void synchronizedArrayList() {
		ArrayList<String>  list=new ArrayList<>();
		List synchronizedArrayList=Collections.synchronizedList(list);
		
	}

	private static void basicOperation(List<String> list) {
		System.out.println(list.add("A"));
		System.out.println(list.add(null));
		System.out.println(list.add(null));
		
		System.out.println(list instanceof Serializable);
		System.out.println(list instanceof Cloneable);
		System.out.println(list instanceof RandomAccess);
	}
}
