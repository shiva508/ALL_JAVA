package com.dasari.featurs8.codepoints;

import java.io.InputStream;
import java.util.stream.IntStream;

public class CodePointClient {
	public static void main(String[] args) {
		String inputData = "sgshadwyte";
		IntStream stream=inputData.codePoints();
		stream.forEach(System.out::println);
	}
}
