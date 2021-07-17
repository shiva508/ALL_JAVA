package com.dasari.featurs8.lambda;

public class LambdaJava8Tester {
	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static void main(String[] args) {
		MathOperation add = (a, b) -> a + b;
		MathOperation sub = (a, b) -> a - b;
		LambdaJava8Tester lambdaJava8Tester = new LambdaJava8Tester();
		System.out.println(lambdaJava8Tester.operate(4, 8, add));
		System.out.println(lambdaJava8Tester.operate(4, 8, sub));
	}
}
