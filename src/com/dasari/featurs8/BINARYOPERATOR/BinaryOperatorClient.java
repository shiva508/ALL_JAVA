package com.dasari.featurs8.BINARYOPERATOR;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorClient {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> powerBiFunc = (num1, num2) -> Math.pow(num1, num2);
		Double powerValue=powerBiFunc.apply(8, 4);
		System.out.println(powerValue);
		BinaryOperator<Integer> sum=(num1,num2)->num1+num2;
		Integer binarySumOperator=sum.apply(508,504);
		System.out.println(binarySumOperator);
		List<Integer> arrayList=Arrays.asList(1,2,3,4,5,6,7,8,4,5);
		//Integer mathOperation=mathOperation(arrayList);
	}

	private static Integer mathOperation(List<Integer> arrayList) {
		
		return null;
	}
}
