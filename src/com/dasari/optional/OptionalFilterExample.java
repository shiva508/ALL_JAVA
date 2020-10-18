package com.dasari.optional;

import java.util.Optional;

public class OptionalFilterExample {

	public static void main(String[] args) {
		Optional<String> gender=Optional.of("male");
		Optional<String> emptyGender=Optional.empty();
		
		System.out.println(gender.filter(gdr->gdr.equals("MALE")));
		System.out.println(gender.filter(gder->gder.equalsIgnoreCase("MALE")));
		System.out.println(emptyGender.filter(g->g.equalsIgnoreCase("MALE")));
	}

}
