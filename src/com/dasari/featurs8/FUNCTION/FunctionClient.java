package com.dasari.featurs8.FUNCTION;

import java.util.function.Function;

public class FunctionClient {
	public static void main(String[] args) {
		basicFunction();
	}

	private static void basicFunction() {
		Function<String, Integer> lengthFun = in -> in.length();
		Function<Integer,Integer> multiply=in->in*408;
		Integer lengthFunResult=lengthFun.apply("Shiva");
		System.out.println(lengthFunResult);
		Integer count=lengthFun.andThen(multiply).apply("SHIBAADAD");
		System.out.println(count);
	}
}
