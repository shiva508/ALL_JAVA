package com.dasari.featurs8.streams.iterate;

import java.util.stream.Stream;

public class StreamIterateSimulator {
	public static void main(String[] args) {
		System.out.println("0->9");
		Stream.iterate(0, num->num+1).limit(10).forEach(num->System.out.println(num));
		System.out.println("Odd num only");
		Stream.iterate(0, numOdd->numOdd+1).filter(x->x%2 !=0).limit(10).forEach(num->System.out.println(num));
	}
}
