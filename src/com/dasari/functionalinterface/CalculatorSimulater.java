package com.dasari.functionalinterface;

public class CalculatorSimulater {

	public static void main(String[] args) {
		Calculator calculator = (Integer value1, Integer value2) -> {
			Integer sum = value1 + value2;
			return sum;
		};
		System.out.println(calculator.add(408, 508));
		
	}
}
