package com.dasari.featurs8.streams.intstream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample {
	public static void main(String[] args) {
		IntStream.of(1, 2, 3).forEach(System.out::println);
		System.out.println("======================");
		System.out.println(IntStream.of(1).count());
		System.out.println("======================");
		IntStream.range(0, 5).forEach(System.out::println);
		System.out.println("======================");
		IntStream.rangeClosed(0, 5).forEach(System.out::println);
		System.out.println("======================");
		IntStream.iterate(0, i -> i + 2).limit(3).forEach(System.out::println);
		IntStream.rangeClosed(0,5).forEach(System.out::println);
		System.out.println("======================");
		IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(8).forEach(System.out::println);
		System.out.println("======================");
		IntStream.rangeClosed(1, 5).map(i -> i * i).forEach(System.out::println);
		System.out.println("======================");
		IntStream.rangeClosed(1, 5).filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("======================");
		Stream<Integer> myStream = IntStream.rangeClosed(1,5).boxed();
		myStream.forEach(System.out::println);
		System.out.println("======================");
		Stream<Double> doubleStram=IntStream.rangeClosed(1,5).mapToDouble(i->i).boxed();
		doubleStram.forEach(System.out::println);
		System.out.println("======================");
		Stream<Long> longStream=IntStream.rangeClosed(1,5).mapToLong(i->i).boxed();
		longStream.forEach(System.out::println);
		System.out.println("======================");
		boolean anyMatch=IntStream.rangeClosed(0,5).anyMatch(i->i%2==0);
		System.out.println(anyMatch);
		System.out.println("======================");
		boolean allMatch=IntStream.rangeClosed(0,5).allMatch(i->i%2==0);
		System.out.println(allMatch);
		System.out.println("======================");
		boolean noneMatch=IntStream.rangeClosed(0,5).noneMatch(i->i%2==0);
		System.out.println(noneMatch);
		System.out.println("======================");
		boolean filterAllMatch=IntStream.rangeClosed(1,5).filter(i->i%2==0).allMatch(i->i%2==0);
		System.out.println(filterAllMatch);
		System.out.println("======================");
		boolean filterNoneMatch=IntStream.rangeClosed(1,5).filter(i->i%2==0).noneMatch(i->i%2!=0);
		System.out.println(filterNoneMatch);
		System.out.println("======================");
		int maxVal=IntStream.rangeClosed(1, 4).max().getAsInt();
		System.out.println(maxVal);
		System.out.println("======================");
		int minVal=IntStream.rangeClosed(1, 4).min().getAsInt();
		System.out.println(minVal);
		System.out.println("======================");
		int reduse=IntStream.rangeClosed(1, 4).reduce(1, (x,y)->x*y);
		System.out.println(reduse);
	}
}

