package com.dasari.featurs8.BIFUNCTION;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionClient {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunSum=(num1,num2)->num1+num2;
		Integer sumOfNum=biFunSum.apply(508, 504);
		System.out.println("==========================");
		System.out.println(sumOfNum);
		System.out.println("==========================");
		BiFunction<Integer, Integer, Double> biFunPow=(num1,num2)->Math.pow(num1, num2);
		Double power=biFunPow.apply(8,4);
		System.out.println(power);
		System.out.println("==========================");
		Function<Double, String> func=(input)->"Result : " + String.valueOf(input);
		System.out.println(func.apply(1.00));
		String stringResult=biFunPow.andThen(func).apply(8,4);
		System.out.println(stringResult);
		System.out.println("==========================");
		String powFunctionMethod=powerBiFuString(4,8,(num1,num2)->Math.pow(num1,num2),(result)->"Output:"+String.valueOf(result));
		System.out.println("powFunctionMethod:"+powFunctionMethod);
		String powFunctionMethodGereric=powerBiFuStringGeneric(4,8,(num1,num2)->Math.pow(num1,num2),(result)->"Pow:"+String.valueOf(result));
		System.out.println("powFunctionMethodGereric:"+powFunctionMethodGereric);
		String sumOfNumber=powerBiFuStringGeneric(4,8,(num1,num2)->(num1+num2),(result)->"Sum:"+String.valueOf(result));
		System.out.println(sumOfNumber);
		String multiplyOfNumber=powerBiFuStringGeneric(4,8,(num1,num2)->(num1*num2),(result)->"MULTIPLY:"+String.valueOf(result));
		System.out.println(multiplyOfNumber);
		String stringConcat=powerBiFuStringGeneric("A","B",(str1,str2)->(str1+str2),(result)->result+"cdefg");
		System.out.println(stringConcat);
		Integer parseInt=powerBiFuStringGeneric("504","508",(str1,str2)->(str1+str2),(result)->Integer.parseInt(result));
		System.out.println(parseInt);
		System.out.println("==========================");
		StudentPoolLocater locater=objectFactory("40.741895", "-73.989308",StudentPoolLocater::new);
		StudentPoolLocater locaterGeneric=objectFactoryGe("2323", "-655",StudentPoolLocater::new);
		System.out.println(locater);
		System.out.println(locaterGeneric);
		
		
	}

	private static <R extends StudentPoolLocater> R  objectFactory(String Latitude, String Longitude,BiFunction<String, String, R> func) {
		return func.apply(Latitude, Longitude);
	}
	
	private static <T1,T2,R> R  objectFactoryGe(T1 Latitude, T2 Longitude,BiFunction<T1, T2, R> func) {
		return func.apply(Latitude, Longitude);
	}

	private static <A1,A2,R,R2> R2 powerBiFuStringGeneric(A1 a1, A2 a2, BiFunction<A1, A2, R> biFun, Function<R, R2> func) {
		return biFun.andThen(func).apply(a1, a2);
	}

	private static <R> R powerBiFuString(Integer num1, Integer num2, BiFunction<Integer, Integer, Double> biFun, Function<Double, R> func) {
		return biFun.andThen(func).apply(num1, num2);
	}
}
