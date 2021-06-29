package com.dasari.featurs8.FUNCTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.codec.digest.DigestUtils;

public class FunctionClient {
	public static void main(String[] args) {
		basicFunction();
		FunctionClient client = new FunctionClient();
		String sha = client.sha256("");
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		listToMap(client, list);

		listToMapWithMethodReferance(client, list);
		List<String> shsData = listToListGenerator(list, client::sha256);
		System.out.println(shsData);
	}

	private static <T, R> List<R> listToListGenerator(List<T> list, Function<T, R> fnc) {
		List<R> listData = new ArrayList();
		for (T t : list) {
			listData.add(fnc.apply(t));
		}
		return listData;
	}

	private String sha256(String input) {
		return DigestUtils.sha256Hex(input);
	}

	private static void listToMapWithMethodReferance(FunctionClient client, List<String> list) {
		Map<String, Integer> map2 = client.convertListToMap(list, client::getLength);
		System.out.println(map2);
	}

	private Integer getLength(String input) {
		return input.length();
	}

	private static void listToMap(FunctionClient client, List<String> list) {
		Map<String, Integer> map = client.convertListToMap(list, x -> x.length());
		System.out.println(map);
	}

	private <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> fnc) {
		Map<T, R> map = new HashMap<>();
		for (T t : list) {
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
