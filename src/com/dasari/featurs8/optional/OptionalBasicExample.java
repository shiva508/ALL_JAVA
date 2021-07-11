package com.dasari.featurs8.optional;

import java.util.Optional;

public class OptionalBasicExample {

	public static void main(String[] args) {
		Optional<String> genger = Optional.of("MALE");
		String answer1 = "yes";
		String answer2 = null;
		System.out.println("Non-Empty Optional:" + genger);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("Non-Empty Optional: Gender value : " + genger.get());
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("Empty Optional: " +Optional.empty());
		System.out.println("++++++++++++++++++++++++++++++");
		//System.out.println("Empty Optional: " +Optional.empty().get());
		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1).get());
		System.out.println("ofNullable on Empty Optional: " +Optional.ofNullable(answer2));
		// java.lang.NullPointerException
       // System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
	}
}
