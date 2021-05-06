package com.dasari.collection.set.hashset;

import java.util.HashSet;

public class StackSimullator {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println(hashSet.add("D"));
		System.out.println(hashSet);
	}
}
