package com.dasari.featurs8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaWithCollections {
	public static boolean isStringOnlyAlphabet(String message) {
		return ((!message.equals("") && (message != null) && (message.chars().allMatch(Character::isAlphabetic))));
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(205);
		al.add(102);
		al.add(98);
		al.add(275);
		al.add(203);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);

		Collections.sort(al, (a1, a2) -> (a1 > a2) ? -1 : (a1 < a2) ? 1 : 0);
		System.out.println("Elements of the ArrayList after" + " sorting : " + al);
		TreeSet<Integer> h = new TreeSet<>((t1, t2) -> (t1 > t2) ? -1 : (t1 < t2) ? 1 : 0);
		h.add(850);
		h.add(235);
		h.add(1080);
		h.add(15);
		h.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + h);
		TreeMap<Integer, String> tm = new TreeMap<>((tm1, tm2) -> (tm1 > tm2) ? -1 : (tm1 < tm2) ? 1 : 0);
		tm.put(1,"Apple");
		tm.put(4,"Mango");
		tm.put(5,"Orange");
		tm.put(2,"Banana");
		tm.put(3,"Grapes");
		System.out.println("Elements of the TreeMap " + "after sorting are : " + tm);

		System.out.println(isStringOnlyAlphabet("aa"));

	}
}
