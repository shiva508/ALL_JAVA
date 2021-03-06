package com.dasari.reflection.proxy;

import java.lang.reflect.Proxy;

public class ProxySimullator {
	public static void main(String[] args) {
		Animal animal = new Cat();
		Animal animal2 =(Animal)Proxy.newProxyInstance(
				ProxySimullator.class.getClassLoader(), 
				new Class[] { Animal.class },
				new AnimalInvocationHandler(animal));
		animal.makeSound();
		animal2.makeSound();
	}
}
