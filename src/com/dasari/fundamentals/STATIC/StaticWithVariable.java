package com.dasari.fundamentals.STATIC;

public class StaticWithVariable {
	public final static Integer ROLL_NUMBER = 108;
	static {
		System.out.println("STATIC BLOCL");
	}

	public StaticWithVariable() {
		System.out.println("FROM CONSTRUCTOR");
	}
}
