package com.dasari.oops;

public class Chield extends Parent{
	public Integer a = 10;
	
	public static void main(String[] args) {
		Chield chield=new Chield();
		Parent parentReference=new Chield();
		System.out.println(chield.a);
		System.out.println(parentReference.a);
	}
}
