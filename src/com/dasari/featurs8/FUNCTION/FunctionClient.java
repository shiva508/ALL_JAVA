package com.dasari.featurs8.FUNCTION;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionClient {
	public static void main(String[] args) {
		basicFunction();
		FunctionClient client = new FunctionClient();
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		listToMap(client,list);
		
		listToMapWithMethodReferance(client, list);
	}

	private static void listToMapWithMethodReferance(FunctionClient client, List<String> list) {
		Map<String, Integer> map2 = client.convertListToMap(list, client::getLength);
        System.out.println(map2);
	}

	private Integer getLength(String input) {
		return input.length();
	}

	private static void listToMap(FunctionClient client,List<String> list) {
		Map<String, Integer> map = client.convertListToMap(list, x -> x.length());
		System.out.println(map);
	}

	private <T,R>Map<T, R> convertListToMap(List<T> list, Function<T, R> fnc) {
		Map<T, R> map=new HashMap<>();
		for(T t:list) {
			map.put(t, fnc.apply(t));
		}
		return map;
	}

	private static void basicFunction() {
		Function<String, Integer> lengthFun = in -> in.length();
		Function<Integer, Integer> multiply = in -> in * 408;
		Integer lengthFunResult = lengthFun.apply("Shiva");
		System.out.println(lengthFunResult);
		Integer count = lengthFun.andThen(multiply).apply("SHIBAADAD");
		System.out.println(count);
	}
}
