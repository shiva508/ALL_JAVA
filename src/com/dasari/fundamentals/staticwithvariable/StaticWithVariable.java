package com.dasari.fundamentals.staticwithvariable;

public class StaticWithVariable {
	public final static Integer ROLL_NUMBER = 108;
	static {
		System.out.println("STATIC BLOCL");
	}

	public static void main(String[] args) {
		System.out.println(StaticWithVariable.ROLL_NUMBER);
	}
}
