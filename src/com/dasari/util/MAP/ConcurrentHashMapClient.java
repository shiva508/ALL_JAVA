package com.dasari.util.MAP;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClient {
	public static void main(String[] args) {
		concurrentHashMapProcessor();
	}

	private static void concurrentHashMapProcessor() {
		Map<String, String> cocurrentHashMap = new ConcurrentHashMap<>();
		cocurrentHashMap.put("1", "1");
		cocurrentHashMap.put("2", "1");
		cocurrentHashMap.put("3", "1");
		cocurrentHashMap.put("4", "1");
		cocurrentHashMap.put("5", "1");
		cocurrentHashMap.put("6", "1");
	}
}
