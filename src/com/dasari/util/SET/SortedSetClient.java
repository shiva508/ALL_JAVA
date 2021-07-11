package com.dasari.util.SET;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClient {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("Shiva");
		sortedSet.add("Nithya");
		sortedSet.add("Madhu");
		sortedSet.add("Sai");
		sortedSet.add("Indhu");
		sortedSet.add("Geetha");
		System.out.println(sortedSet);
	}
}
