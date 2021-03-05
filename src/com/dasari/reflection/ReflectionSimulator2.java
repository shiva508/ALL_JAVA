package com.dasari.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.dasari.reflection.annotation.Call;
import com.dasari.reflection.service.ProductService;

public class ReflectionSimulator2 {
	public static void main(String[] args) {

		String k = "com.dasari.reflection.service.ProductService";
		try {
			Class clazz=Class.forName(k);
			Constructor constructor=clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object obj=constructor.newInstance();
			Method [] methods=clazz.getDeclaredMethods();
			for(Method method:methods) {
				if(method.isAnnotationPresent(Call.class)) {
					method.invoke(obj);
				}
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
