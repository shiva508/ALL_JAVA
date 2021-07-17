package com.dasari.featurs8.lambda;

import com.dasari.featurs8.lambda.FuncInterface;
import com.dasari.featurs8.lambda.FuncInterfaceTwoParameters;

public class LambdaTest {

public int operation(int a,int b,FuncInterfaceTwoParameters fu) {
	return fu.addTwoParameters(a, b);
}
	public static void main(String[] args) {
		FuncInterface obj=(int x)->System.out.println(2*x);
		obj.abstractFun(4);
		FuncInterfaceTwoParameters two=(int x,int y)->(x+y);
		
		System.out.println(two.addTwoParameters(4, 8));
		FuncInterfaceTwoParameters add=(int x,int y)->(x+y);
		FuncInterfaceTwoParameters mul=(int x,int y)->(x*y);
		
		LambdaTest lambdaTest=new LambdaTest();
		System.out.println(lambdaTest.operation(2, 2, add));
		System.out.println(lambdaTest.operation(3, 3, mul));
		
	}
}
