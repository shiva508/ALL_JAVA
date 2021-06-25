package com.dasari.featurs8.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ToUpperCase {

	public static void main(String[] args) {
		String aa = "asasa,";
		String[] a = aa.split(",");
		System.out.println(a[0]);
		System.out.println(processs("data", new Processor() {

			@Override
			public String process(String in) {
				return in.toUpperCase();
			}
			
		}));
		System.out.println(processs("data", in -> in.toUpperCase()));
		System.out.println(processFunction("We ", in -> in.toUpperCase()));
		System.out.println(processLamda("meaa", String::toUpperCase));
		System.out.println(processConcatlambda("Shiva",input->input.concat(" DASARI")));
		System.out.println(processBiFunction("DASARISHIVA",6,(input,index)->input.substring(index)));
		System.out.println(processBiFunction("DASARISHIVA",6,String::substring));
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
	
	private static String  processConcatlambda(String inputData,Function<String, String> function) {
		return function.apply(inputData);
	}
	
	private static String  processComputelambda(String inputData,Function<String, String> function) {
		return null;
	}
	
	private static String  processBiFunction(String inputData,Integer index,BiFunction<String, Integer, String> biFunction) {
		return biFunction.apply(inputData,index);
	}

}
