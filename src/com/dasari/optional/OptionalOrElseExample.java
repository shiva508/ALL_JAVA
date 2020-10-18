package com.dasari.optional;

import java.util.Optional;

public class OptionalOrElseExample {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		System.out.println(gender.orElse("N/A"));
		System.out.println(emptyGender.orElse("N/A"));
		System.out.println(gender.orElseGet(()->"N/A"));
		System.out.println(emptyGender.orElseGet(()->"N/A"));
		System.out.println(gender.orElseThrow());
		//System.out.println(emptyGender.orElseThrow());
		System.out.println(gender.orElseThrow(RuntimeException::new));
		//System.out.println(emptyGender.orElseThrow(RuntimeException::new));
	}

}
