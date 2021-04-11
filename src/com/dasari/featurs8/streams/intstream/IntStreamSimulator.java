package com.dasari.featurs8.streams.intstream;

import java.util.stream.IntStream;

public class IntStreamSimulator {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("==========================");
		IntStream.range(0, 5).forEachOrdered(System.out::println);
	}
}
