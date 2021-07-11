package com.dasari.featurs8.optional;

import java.util.Optional;

public class OptionalMapFlapMapExample {

	public static void main(String[] args) {
		Optional<String> nonEmptyGender = Optional.of("male");
		Optional<String> emptyGender = Optional.empty();
		System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
		System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

		Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
		System.out.println("Optional value   :: "+nonEmptyOtionalGender);
		System.out.println(nonEmptyOtionalGender.map(gender->gender.map(String::toUpperCase)));
		System.out.println(nonEmptyOtionalGender.flatMap(gender->gender.map(String::toUpperCase)).get());
	}
}
