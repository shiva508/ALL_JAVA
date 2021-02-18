package com.dasari.featurs9.streamapichanges;

import java.util.stream.Stream;

public class StreamApiChangesSumullator {
	public static void main(String[] args) {
		Stream.of("A", "B", "C","", "D").takeWhile(data -> !data.isBlank()).forEach(System.out::println);
		Stream.of("A", "B", "C","", "D").takeWhile(data -> !data.matches("")).forEach(System.out::println);
	}
}
