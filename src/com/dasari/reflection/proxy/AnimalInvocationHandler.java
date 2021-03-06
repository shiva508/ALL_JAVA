package com.dasari.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {
	private final Animal animal;

	public AnimalInvocationHandler(Animal animal) {
		this.animal = animal;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(":)");
		animal.makeSound();
		System.out.println(":/");
		return null;
	}

}
