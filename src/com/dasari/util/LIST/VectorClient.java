package com.dasari.util.LIST;

import java.util.Vector;

public class VectorClient {
	public static void main(String[] args) {
		Vector<Integer> integers = new Vector<>();
		for (int i = 0; i < 10; i++) {
			integers.add(i);
		}
		System.out.println(integers);
		System.out.println(integers.capacity());
		integers.addElement(10);
		System.out.println(integers.capacity());
		System.out.println(integers.size());
	}
}
