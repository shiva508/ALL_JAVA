package com.dasari.jvm.customclassloader;

public class CustomClassLoader extends ClassLoader {
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return super.loadClass(name);
	}
}
