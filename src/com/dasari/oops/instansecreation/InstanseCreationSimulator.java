package com.dasari.oops.instansecreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InstanseCreationSimulator {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		Plan plan=new Plan();
		Plan instanseWay=(Plan) Class.forName("com.dasari.oops.instansecreation.Plan").newInstance();
		Plan instanseWay2=Plan.class.newInstance();
		Class clazz=Class.forName("com.dasari.oops.instansecreation.Plan");
		Constructor<Plan> constructor=clazz.getEnclosingConstructor();
		Plan plan3=(Plan) constructor.newInstance();
	}
}
