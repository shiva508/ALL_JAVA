package com.dasari.featurs8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalSimulator {
	public static void main(String[] args) {
		List<Integer> numobers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> optional=numobers.stream().filter(num ->num>50).findFirst();
		if(optional.isPresent()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		optional.ifPresent(num->System.out.println(num));
	}
}
