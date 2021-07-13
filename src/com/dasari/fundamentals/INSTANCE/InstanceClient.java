package com.dasari.fundamentals.INSTANCE;

public class InstanceClient {
	String userName;
	
	{
		System.out.println("INSTANCE BLOCK");
	}
	public InstanceClient() {
		System.out.println("COnSTRUCTOR ");
	}
	
	public static void main(String[] args) {
		InstanceClient instanceClient=new InstanceClient();
		System.out.println(instanceClient.userName);
	}
}
