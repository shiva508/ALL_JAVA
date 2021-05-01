package com.dasari.collection.list.vector;

import java.util.Vector;
import java.util.stream.IntStream;

public class VectorSimulator {
	public static void main(String[] args) {
		Vector vector=new Vector();
		System.out.println(vector.capacity());
		IntStream.rangeClosed(1, 10).forEach(data->vector.addElement(data));
		System.out.println(vector);
		System.out.println(vector.capacity());
		vector.add(11);
		System.out.println(vector);
		System.out.println(vector.capacity());
		
	}
}
