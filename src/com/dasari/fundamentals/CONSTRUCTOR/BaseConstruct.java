package com.dasari.fundamentals.CONSTRUCTOR;

public class BaseConstruct {
	String name;

	public BaseConstruct() {
		this("");
		System.out.println("DEFAULT CONSTRUCTOR:BaseConstruct");
	}

	public BaseConstruct(String name) {
		this.name = name;
		System.out.println("WITH PARAM BASE CLASS:"+name);
	}
	
	
	
}
