package com.dasari.oops.methodhiding;

public class BaseMethodClass {
	public static void printStaticMessage() {
		System.out.println("parent static method");
	}

	public void printmessage() {
		System.out.println("parent non static method");
	}
}
