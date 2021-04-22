package com.dasari.innerclass;

public class MethodLocalInner {
	int x = 408;
	static int y = 504;

	public void methodLocalInnerMethod() {
		class LOcalInner {
			public void sum(int a, int b) {
				System.out.println(a + b);
			}

			public void displlayMethod() {
				System.out.println("X="+x);
				System.out.println("Y="+y);
			}
		}
		LOcalInner lOcalInner = new LOcalInner();
		lOcalInner.sum(508, 408);
		lOcalInner.displlayMethod();
	}

	public static void main(String[] args) {
		new MethodLocalInner().methodLocalInnerMethod();
	}
}
