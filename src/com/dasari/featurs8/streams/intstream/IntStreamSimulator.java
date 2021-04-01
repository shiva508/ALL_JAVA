package com.dasari.featurs8.streams.intstream;

import java.util.stream.IntStream;

public class IntStreamSimulator {
	public static void main(String[] args) {
		IntStream.range(0, 5).forEachOrdered(System.out::println);
	}
}
