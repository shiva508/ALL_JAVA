package com.dasari.innerclass;

public class OutSide {
	public static void main(String[] args) {

		new Outer().new Inner().innerClassMethod();
	}
}
