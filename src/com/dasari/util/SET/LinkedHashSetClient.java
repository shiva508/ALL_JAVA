package com.dasari.util.SET;

import java.util.LinkedHashSet;

public class LinkedHashSetClient {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		System.out.println(linkedHashSet.add("A"));
		System.out.println(linkedHashSet.add("A"));
		System.out.println(linkedHashSet);
	}
}
