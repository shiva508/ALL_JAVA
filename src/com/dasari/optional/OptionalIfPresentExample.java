package com.dasari.optional;

import java.util.Optional;

public class OptionalIfPresentExample {
	public static void main(String[] args) {
		Optional<String> gender=Optional.of("MALE");
		Optional<String> emptyGender=Optional.empty();
		if(gender.isPresent()) {
			System.out.println("GENDER IS PRESENT");
		}else {
			System.out.println("GENDER IS NOT PRESENT");
		}
        gender.ifPresent(g -> System.out.println("In gender Option, value available."));
        emptyGender.ifPresent(gd->System.out.println("In emptyGender Option, value available."));
	}
}
