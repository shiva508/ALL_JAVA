package com.dasari.fundamentals.CONSTRUCTOR;

public class DerivedConstruct extends BaseConstruct {
	public DerivedConstruct() {
		System.out.println("DEFAULT CONSTRUCTOR:DerivedConstruct");
	}
	public DerivedConstruct(String name) {
		super(name);
		System.out.println("PARAMETER CONSTRUCTOR:"+name);
	}
	
	public static void main(String[] args) {
		DerivedConstruct construct=new DerivedConstruct("Shiva");
	}
}
