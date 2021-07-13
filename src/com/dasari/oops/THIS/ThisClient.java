package com.dasari.oops.THIS;

public class ThisClient {
	String userName = "Shiva";

	public void checkThisVeriable() {
		this.userName = "Dasari Shiva";
		System.out.println(this.userName);
		this.userName = "Dasari Shiva Nithya";
		System.out.println(this.userName);
	}

	public static void main(String[] args) {
		new ThisClient().checkThisVeriable();
	}
}
