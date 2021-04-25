package com.dasari.featurs8.functionalInterface;

import java.util.function.Function;

public class ToUpperCase {

	public static void main(String[] args) {
		String aa = "asasa,";
		String[] a = aa.split(",");
		System.out.println(a[0]);
		System.out.println(processs("data", in -> in.toUpperCase()));
		System.out.println(processFunction("We ", in -> in.toUpperCase()));
		System.out.println(processLamda("meaa", String::toUpperCase));
		/* System.out.println(processLamdaSubString("meaa", ()->new String); */
	}

	private static String processLamdaSubString(String string, String ssdh) {

		return ssdh;
	}

	private static String processFunction(String string, Function<String, String> fun) {

		return fun.apply(string);
	}

	private static String processLamda(String string, Function<String, String> fun) {

		return fun.apply(string);
	}

	private static String processs(String string, Processor processor) {
		return processor.process(string);

	}
}
