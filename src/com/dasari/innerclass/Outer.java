package com.dasari.innerclass;

public class Outer {

	int x = 408;
	static int y = 504;

	class Inner {
		int x=508;
		public void innerClassMethod() {
			System.out.println("innerClassMethod");
			System.out.println("X="+x);
			System.out.println("Y="+y);
			System.out.println("THIS.X="+this.x);
			System.out.println("Outer.THIS.X="+Outer.this.x);
		}
	}

	public void outterMethod() {
		Inner inner = new Inner();
		inner.innerClassMethod();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outterMethod();
	}
}
