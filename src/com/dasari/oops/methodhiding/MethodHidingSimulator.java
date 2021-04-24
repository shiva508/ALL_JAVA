package com.dasari.oops.methodhiding;

public class MethodHidingSimulator {
	public static void main(String[] args) {
		BaseMethodClass baseMethodClass=new BaseMethodClass();
		BaseMethodClass baseMethodClass2=new ChildMethodClass();
		ChildMethodClass childMethodClass=new ChildMethodClass();
		baseMethodClass.printStaticMessage();
		baseMethodClass.printmessage();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		baseMethodClass2.printStaticMessage();;
		baseMethodClass2.printmessage();;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		childMethodClass.printStaticMessage();;
		childMethodClass.printmessage();;
	}
}
