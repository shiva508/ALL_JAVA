package com.dasari.oops.methodhiding;

public class ChildMethodClass extends BaseMethodClass {
	
	public static void printStaticMessage() {
		System.out.println("ChildMethodClass static method");
	}

	public void printmessage() {
		System.out.println("ChildMethodClass non static method");
	}
}
