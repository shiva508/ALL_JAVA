package com.dasari.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.dasari.reflection.service.ProductService;

public class ReflectionSimulator {
	public static void main(String[] args) {

		String k = "com.dasari.reflection.service.ProductService";
		try {
			Class productService = Class.forName(k);
			Constructor c = productService.getDeclaredConstructor();
			c.setAccessible(true);
			Object obj = c.newInstance();
			System.out.println(obj);
			System.out.println(obj.getClass());
			Method method=productService.getDeclaredMethod("addProduct");
			method.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
