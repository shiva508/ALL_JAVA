package com.dasari.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSimulator3 {
	public static void main(String[] args) {

		String k = "com.dasari.reflection.service.ProductService";
		try {
			Class clazz = Class.forName(k);
			Constructor constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object obj = constructor.newInstance();
			Field [] fields=clazz.getDeclaredFields();
			for(Field field:fields) {
				field.setAccessible(true);
				field.set(obj, 408);
			}

			Method method=clazz.getDeclaredMethod("result");
			method.invoke(obj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
