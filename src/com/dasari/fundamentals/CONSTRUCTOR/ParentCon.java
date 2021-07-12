package com.dasari.fundamentals.CONSTRUCTOR;

public class ParentCon {
	
	public ParentCon(String data1) {
		this("Shiva","Dasari");
		System.out.println("data1:"+data1);
	}

	public ParentCon(String data1, String data2) {
		System.out.println("data1:"+data1+",data2:"+data2);
	}
	public ParentCon() {
		this("Shiva");
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		new ParentCon();
	}
}
