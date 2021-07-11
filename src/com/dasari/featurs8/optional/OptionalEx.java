package com.dasari.featurs8.optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		Optional<String> is=Optional.of("Shiva");
		System.out.println(is.isPresent());
		System.out.println("=====================");
		Optional<String> is1=is.ofNullable(null);
		System.out.println(is1.isPresent());
		System.out.println("=====================");
		System.out.println(is.empty());
		System.out.println("=====================");
		System.out.println(is1.empty());
		System.out.println("=====================");
		is.ifPresent(name->System.out.println(name.length()));
	}

}
