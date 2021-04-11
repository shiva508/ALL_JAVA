package com.dasari.featurs9.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalSimulator {
	public static void main(String[] args) {
		List<Integer> numobers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> optional=numobers.stream().filter(num ->num>50).findFirst();
		optional.ifPresentOrElse(num->System.out.println(num),()->System.out.println("No"));
		Optional<Integer> optional2=numobers.stream().filter(num ->num>50).findFirst().or(()->Optional.of(408));
		System.out.println(optional2.get());
	}
}
